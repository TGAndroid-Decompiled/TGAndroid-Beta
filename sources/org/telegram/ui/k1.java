package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
public final class k1 {
    public final ArrayList f35541a = new ArrayList();
    public final HashMap f35542b = new HashMap();
    public final int f35543c = 1000;
    public final l1 d;

    public k1(l1 l1Var) {
        this.d = l1Var;
    }

    public final float a(float[] fArr, int i10, int i11) {
        float f10 = 0.0f;
        while (i10 < i11) {
            f10 += fArr[i10];
            i10++;
        }
        return this.f35543c / f10;
    }
}
