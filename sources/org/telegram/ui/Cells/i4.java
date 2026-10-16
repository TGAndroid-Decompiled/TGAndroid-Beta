package org.telegram.ui.Cells;

import java.util.ArrayList;
import java.util.HashMap;
public final class i4 {
    public ArrayList f21003a;
    public ArrayList f21004b;
    public HashMap f21005c;
    public int d;
    public int e;
    public int f21006f;
    public float f21007g;
    public int h;
    public float f21008i;

    public final float a(float[] fArr, int i10, int i11) {
        float f7 = 0.0f;
        while (i10 < i11) {
            f7 += fArr[i10];
            i10++;
        }
        return this.h / f7;
    }
}
