package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
public final class j1 {
    public final ArrayList f37502a = new ArrayList();
    public final HashMap f37503b = new HashMap();
    public final int f37504c = 1000;
    public final k1 d;

    public j1(k1 k1Var) {
        this.d = k1Var;
    }

    public final float a(float[] fArr, int i10, int i11) {
        float f7 = 0.0f;
        while (i10 < i11) {
            f7 += fArr[i10];
            i10++;
        }
        return this.f37504c / f7;
    }
}
