package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class zy0 extends ArrayList {
    public final Class f30673a;
    public final Class f30674b;

    public zy0(Class cls, Class cls2) {
        this.f30673a = cls;
        this.f30674b = cls2;
    }

    public final m.e3 i() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.f30673a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.f30674b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new m.e3(objArr, objArr2);
    }
}
