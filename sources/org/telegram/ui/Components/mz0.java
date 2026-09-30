package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class mz0 extends ArrayList {
    public final Class f26469a;
    public final Class f26470b;

    public mz0(Class cls, Class cls2) {
        this.f26469a = cls;
        this.f26470b = cls2;
    }

    public final la.h i() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.f26469a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.f26470b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new la.h(objArr, objArr2);
    }
}
