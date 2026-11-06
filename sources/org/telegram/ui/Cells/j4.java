package org.telegram.ui.Cells;

import java.util.ArrayList;
import java.util.HashMap;
public final class j4 {
    public ArrayList f29352a;
    public ArrayList f29353b;
    public HashMap f29354c;
    public int d;
    public int f29355e;
    public int f29356f;
    public float f29357g;
    public int h;
    public float f29358i;

    public final float a(int i7, int i10, float[] fArr) {
        float f10 = 0.0f;
        while (i7 < i10) {
            f10 += fArr[i7];
            i7++;
        }
        return this.h / f10;
    }
}
