package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class mz0 extends ArrayList {
    public final Class f26567a;
    public final Class f26568b;

    public mz0(Class cls, Class cls2) {
        this.f26567a = cls;
        this.f26568b = cls2;
    }

    public final lf.h i() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.f26567a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.f26568b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new lf.h(objArr, objArr2);
    }
}
