package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
public final class i1 {
    public final ArrayList f34411a = new ArrayList();
    public final HashMap f34412b = new HashMap();
    public final int f34413c = 1000;
    public final j1 d;

    public i1(j1 j1Var) {
        this.d = j1Var;
    }

    public final float a(float[] fArr, int i10, int i11) {
        float f7 = 0.0f;
        while (i10 < i11) {
            f7 += fArr[i10];
            i10++;
        }
        return this.f34413c / f7;
    }
}
