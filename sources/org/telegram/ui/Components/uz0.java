package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class uz0 extends ArrayList {
    public final Class f31473a;
    public final Class f31474b;

    public uz0(Class cls, Class cls2) {
        this.f31473a = cls;
        this.f31474b = cls2;
    }

    public final la.h i() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.f31473a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.f31474b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new la.h(objArr, objArr2);
    }
}
