package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class ey0 extends ArrayList {
    public final Class f25893a;
    public final Class f25894b;

    public ey0(Class cls, Class cls2) {
        this.f25893a = cls;
        this.f25894b = cls2;
    }

    public final li.k l() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.f25893a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.f25894b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new li.k(objArr, objArr2);
    }
}
