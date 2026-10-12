package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class wz0 extends ArrayList {
    public final Class f31090a;
    public final Class f31091b;

    public wz0(Class cls, Class cls2) {
        this.f31090a = cls;
        this.f31091b = cls2;
    }

    public final li.k h() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.f31090a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.f31091b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new li.k(objArr, objArr2);
    }
}
