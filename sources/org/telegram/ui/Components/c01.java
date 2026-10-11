package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class c01 extends ArrayList {
    public final Class f25053a;
    public final Class f25054b;

    public c01(Class cls, Class cls2) {
        this.f25053a = cls;
        this.f25054b = cls2;
    }

    public final la.h i() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.f25053a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.f25054b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new la.h(objArr, objArr2);
    }
}
