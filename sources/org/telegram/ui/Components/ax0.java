package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
public final class ax0 extends ArrayList {
    public final Class f32001a;
    public final Class f32002b;

    public ax0(Class cls, Class cls2) {
        this.f32001a = cls;
        this.f32002b = cls2;
    }

    public final k4.j h() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.f32001a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.f32002b, size);
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i3] = ((Pair) get(i3)).first;
            objArr2[i3] = ((Pair) get(i3)).second;
        }
        ?? obj = new Object();
        int length = objArr.length;
        int[] iArr = new int[length];
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj2 = objArr[i10];
            Integer num = (Integer) hashMap.get(obj2);
            if (num == null) {
                num = Integer.valueOf(hashMap.size());
                hashMap.put(obj2, num);
            }
            iArr[i10] = num.intValue();
        }
        obj.f16869a = iArr;
        obj.f16870b = k4.j.q(objArr, iArr);
        obj.f16871c = k4.j.q(objArr2, iArr);
        return obj;
    }
}
