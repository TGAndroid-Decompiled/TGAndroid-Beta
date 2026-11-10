package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
public final class g1 {
    public final ArrayList f45902a = new ArrayList();
    public final HashMap f45903b = new HashMap();
    public final int f45904c = 1000;
    public final h1 d;

    public g1(h1 h1Var) {
        this.d = h1Var;
    }

    public final float a(int i7, int i10, float[] fArr) {
        float f10 = 0.0f;
        while (i7 < i10) {
            f10 += fArr[i7];
            i7++;
        }
        return this.f45904c / f10;
    }
}
