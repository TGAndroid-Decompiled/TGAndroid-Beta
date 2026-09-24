package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class jz0 extends ArrayList {
    public final Class f25564a;
    public final Class f25565b;

    public jz0(Class cls, Class cls2) {
        this.f25564a = cls;
        this.f25565b = cls2;
    }

    public final la.h i() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.f25564a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.f25565b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new la.h(objArr, objArr2);
    }
}
