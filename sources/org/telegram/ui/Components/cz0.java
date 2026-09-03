package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class cz0 extends ArrayList {
    public final Class f24065a;
    public final Class f24066b;

    public cz0(Class cls, Class cls2) {
        this.f24065a = cls;
        this.f24066b = cls2;
    }

    public final l7.w0 i() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.f24065a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.f24066b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new l7.w0(objArr, objArr2);
    }
}
