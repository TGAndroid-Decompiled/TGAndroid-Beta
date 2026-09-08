package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class yy0 extends ArrayList {
    public final Class f33047a;
    public final Class f33048b;

    public yy0(Class cls, Class cls2) {
        this.f33047a = cls;
        this.f33048b = cls2;
    }

    public final m2.t i() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.f33047a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.f33048b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new m2.t(objArr, objArr2);
    }
}
