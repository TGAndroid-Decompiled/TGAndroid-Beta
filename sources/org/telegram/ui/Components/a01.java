package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class a01 extends ArrayList {
    public final Class f24478a;
    public final Class f24479b;

    public a01(Class cls, Class cls2) {
        this.f24478a = cls;
        this.f24479b = cls2;
    }

    public final la.h i() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.f24478a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.f24479b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new la.h(objArr, objArr2);
    }
}
