package org.telegram.ui.Cells;

import java.util.ArrayList;
import java.util.HashMap;
public final class i4 {
    public ArrayList f21206a;
    public ArrayList f21207b;
    public HashMap f21208c;
    public int d;
    public int e;
    public int f21209f;
    public float f21210g;
    public int h;
    public float f21211i;

    public final float a(float[] fArr, int i10, int i11) {
        float f10 = 0.0f;
        while (i10 < i11) {
            f10 += fArr[i10];
            i10++;
        }
        return this.h / f10;
    }
}
