package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
public final class l1 {
    public final ArrayList f39965a = new ArrayList();
    public final HashMap f39966b = new HashMap();
    public final int f39967c = 1000;
    public final m1 d;

    public l1(m1 m1Var) {
        this.d = m1Var;
    }

    public final float a(float[] fArr, int i9, int i10) {
        float f10 = 0.0f;
        while (i9 < i10) {
            f10 += fArr[i9];
            i9++;
        }
        return this.f39967c / f10;
    }
}
