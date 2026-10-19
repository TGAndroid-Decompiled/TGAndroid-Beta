package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
public final class l1 {
    public final ArrayList f38711a = new ArrayList();
    public final HashMap f38712b = new HashMap();
    public final int f38713c = 1000;
    public final m1 d;

    public l1(m1 m1Var) {
        this.d = m1Var;
    }

    public final float a(float[] fArr, int i10, int i11) {
        float f7 = 0.0f;
        while (i10 < i11) {
            f7 += fArr[i10];
            i10++;
        }
        return this.f38713c / f7;
    }
}
