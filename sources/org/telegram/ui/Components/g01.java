package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class g01 extends ArrayList {
    public final Class f26208a;
    public final Class f26209b;

    public g01(Class cls, Class cls2) {
        this.f26208a = cls;
        this.f26209b = cls2;
    }

    public final m.f3 i() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.f26208a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.f26209b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new m.f3(objArr, objArr2);
    }
}
