package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
public final class g01 extends ArrayList {
    public final Class f28349a;
    public final Class f28350b;

    public g01(Class cls, Class cls2) {
        this.f28349a = cls;
        this.f28350b = cls2;
    }

    public final k6.c h() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.f28349a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.f28350b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new k6.c(objArr, objArr2);
    }
}
