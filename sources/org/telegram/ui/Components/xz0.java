package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class xz0 extends ArrayList {
    public final Class f31088a;
    public final Class f31089b;

    public xz0(Class cls, Class cls2) {
        this.f31088a = cls;
        this.f31089b = cls2;
    }

    public final m.h3 h() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.f31088a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.f31089b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new m.h3(objArr, objArr2);
    }
}
