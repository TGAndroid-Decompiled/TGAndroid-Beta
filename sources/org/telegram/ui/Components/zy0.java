package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class zy0 extends ArrayList {
    public final Class f30670a;
    public final Class f30671b;

    public zy0(Class cls, Class cls2) {
        this.f30670a = cls;
        this.f30671b = cls2;
    }

    public final lf.i i() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.f30670a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.f30671b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new lf.i(objArr, objArr2);
    }
}
