package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class uz0 extends ArrayList {
    public final Class f31089a;
    public final Class f31090b;

    public uz0(Class cls, Class cls2) {
        this.f31089a = cls;
        this.f31090b = cls2;
    }

    public final m.g3 h() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.f31089a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.f31090b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new m.g3(objArr, objArr2);
    }
}
