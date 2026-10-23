package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
public final class k1 {
    public final ArrayList f38743a = new ArrayList();
    public final HashMap f38744b = new HashMap();
    public final int f38745c = 1000;
    public final l1 d;

    public k1(l1 l1Var) {
        this.d = l1Var;
    }

    public final float a(float[] fArr, int i10, int i11) {
        float f7 = 0.0f;
        while (i10 < i11) {
            f7 += fArr[i10];
            i10++;
        }
        return this.f38745c / f7;
    }
}
