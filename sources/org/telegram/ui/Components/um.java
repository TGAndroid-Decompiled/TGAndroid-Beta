package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class um {
    public final ArrayList f31051a = new ArrayList();
    public final HashMap f31052b = new HashMap();
    public int f31053c;
    public int d;
    public int e;
    public float f31054f;
    public final ArrayList f31055g;
    public final bn h;

    public um(bn bnVar, ArrayList arrayList) {
        this.h = bnVar;
        this.f31055g = arrayList;
        a();
    }

    public static float b(float[] fArr, int i10, int i11) {
        float f7 = 0.0f;
        while (i10 < i11) {
            f7 += fArr[i10];
            i10++;
        }
        return 1000.0f / f7;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.um.a():void");
    }
}
