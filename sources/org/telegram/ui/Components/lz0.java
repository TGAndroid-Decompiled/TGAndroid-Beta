package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class lz0 extends ArrayList {
    public final Class f26264a;
    public final Class f26265b;

    public lz0(Class cls, Class cls2) {
        this.f26264a = cls;
        this.f26265b = cls2;
    }

    public final lf.i i() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.f26264a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.f26265b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new lf.i(objArr, objArr2);
    }
}
