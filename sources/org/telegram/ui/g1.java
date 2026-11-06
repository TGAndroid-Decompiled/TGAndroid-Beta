package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
public final class g1 {
    public final ArrayList f45774a = new ArrayList();
    public final HashMap f45775b = new HashMap();
    public final int f45776c = 1000;
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
        return this.f45776c / f10;
    }
}
