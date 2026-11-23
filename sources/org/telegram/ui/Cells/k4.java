package org.telegram.ui.Cells;

import java.util.ArrayList;
import java.util.HashMap;
public final class k4 {
    public ArrayList f31007a;
    public ArrayList f31008b;
    public HashMap f31009c;
    public int d;
    public int f31010e;
    public int f31011f;
    public float f31012g;
    public int h;
    public float f31013i;

    public final float a(int i7, int i10, float[] fArr) {
        float f10 = 0.0f;
        while (i7 < i10) {
            f10 += fArr[i7];
            i7++;
        }
        return this.h / f10;
    }
}
