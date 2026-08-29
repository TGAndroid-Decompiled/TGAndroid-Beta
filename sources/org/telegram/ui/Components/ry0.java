package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class ry0 extends ArrayList {
    public final Class f32420a;
    public final Class f32421b;

    public ry0(Class cls, Class cls2) {
        this.f32420a = cls;
        this.f32421b = cls2;
    }

    public final l3.g0 i() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.f32420a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.f32421b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new l3.g0(objArr, objArr2);
    }
}
