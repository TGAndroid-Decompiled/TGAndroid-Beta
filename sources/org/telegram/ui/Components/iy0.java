package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;

public final class iy0 extends ArrayList {

    public final Class f29519a;

    public final Class f29520b;

    public iy0(Class cls, Class cls2) {
        this.f29519a = cls;
        this.f29520b = cls2;
    }

    public final j9.a i() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.f29519a, size);
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.f29520b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new j9.a(objArr, objArr2);
    }
}
