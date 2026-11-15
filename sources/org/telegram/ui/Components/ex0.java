package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class ex0 extends ArrayList {
    public final Class f34447a;
    public final Class f34448b;

    public ex0(Class cls, Class cls2) {
        this.f34447a = cls;
        this.f34448b = cls2;
    }

    public final h6.m f() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.f34447a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.f34448b, size);
        for (int i7 = 0; i7 < size; i7++) {
            objArr[i7] = ((Pair) get(i7)).first;
            objArr2[i7] = ((Pair) get(i7)).second;
        }
        return new h6.m(objArr, objArr2);
    }
}
