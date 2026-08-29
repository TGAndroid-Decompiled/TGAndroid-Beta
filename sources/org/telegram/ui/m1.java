package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
public final class m1 {
    public final ArrayList f40337a = new ArrayList();
    public final HashMap f40338b = new HashMap();
    public final int f40339c = 1000;
    public final n1 d;

    public m1(n1 n1Var) {
        this.d = n1Var;
    }

    public final float a(float[] fArr, int i10, int i11) {
        float f9 = 0.0f;
        while (i10 < i11) {
            f9 += fArr[i10];
            i10++;
        }
        return this.f40339c / f9;
    }
}
