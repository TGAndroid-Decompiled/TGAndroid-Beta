package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class xz0 extends ArrayList {
    public final Class f32733a;
    public final Class f32734b;

    public xz0(Class cls, Class cls2) {
        this.f32733a = cls;
        this.f32734b = cls2;
    }

    public final m.g3 h() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.f32733a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.f32734b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new m.g3(objArr, objArr2);
    }
}
