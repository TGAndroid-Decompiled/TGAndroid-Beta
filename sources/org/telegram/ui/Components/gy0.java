package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class gy0 extends ArrayList {
    public final Class f28895a;
    public final Class f28896b;

    public gy0(Class cls, Class cls2) {
        this.f28895a = cls;
        this.f28896b = cls2;
    }

    public final j4.c i() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.f28895a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.f28896b, size);
        for (int i9 = 0; i9 < size; i9++) {
            objArr[i9] = ((Pair) get(i9)).first;
            objArr2[i9] = ((Pair) get(i9)).second;
        }
        return new j4.c(objArr, objArr2);
    }
}
