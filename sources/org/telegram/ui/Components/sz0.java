package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class sz0 extends ArrayList {
    public final Class f30418a;
    public final Class f30419b;

    public sz0(Class cls, Class cls2) {
        this.f30418a = cls;
        this.f30419b = cls2;
    }

    public final m.g3 h() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.f30418a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.f30419b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new m.g3(objArr, objArr2);
    }
}
