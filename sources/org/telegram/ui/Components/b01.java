package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class b01 extends ArrayList {
    public final Class f24808a;
    public final Class f24809b;

    public b01(Class cls, Class cls2) {
        this.f24808a = cls;
        this.f24809b = cls2;
    }

    public final la.h i() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.f24808a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.f24809b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new la.h(objArr, objArr2);
    }
}
