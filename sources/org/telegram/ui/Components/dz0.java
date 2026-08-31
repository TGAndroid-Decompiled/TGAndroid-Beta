package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class dz0 extends ArrayList {
    public final Class f26351a;
    public final Class f26352b;

    public dz0(Class cls, Class cls2) {
        this.f26351a = cls;
        this.f26352b = cls2;
    }

    public final l7.w0 i() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.f26351a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.f26352b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new l7.w0(objArr, objArr2);
    }
}
