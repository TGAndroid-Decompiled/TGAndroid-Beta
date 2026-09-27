package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class lz0 extends ArrayList {
    public final Class f26235a;
    public final Class f26236b;

    public lz0(Class cls, Class cls2) {
        this.f26235a = cls;
        this.f26236b = cls2;
    }

    public final la.h i() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.f26235a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.f26236b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new la.h(objArr, objArr2);
    }
}
