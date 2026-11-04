package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
public final class h1 {
    public final ArrayList f45772a = new ArrayList();
    public final HashMap f45773b = new HashMap();
    public final int f45774c = 1000;
    public final i1 d;

    public h1(i1 i1Var) {
        this.d = i1Var;
    }

    public final float a(int i3, int i10, float[] fArr) {
        float f10 = 0.0f;
        while (i3 < i10) {
            f10 += fArr[i3];
            i3++;
        }
        return this.f45774c / f10;
    }
}
