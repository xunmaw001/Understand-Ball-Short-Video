package com.entity.view;

import com.entity.DongqiushipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 懂球视频
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-12-13 15:11:02
 */
@TableName("dongqiushipin")
public class DongqiushipinView  extends DongqiushipinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DongqiushipinView(){
	}
 
 	public DongqiushipinView(DongqiushipinEntity dongqiushipinEntity){
 	try {
			BeanUtils.copyProperties(this, dongqiushipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
