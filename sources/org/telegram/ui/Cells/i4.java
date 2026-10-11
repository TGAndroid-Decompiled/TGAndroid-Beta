package org.telegram.ui.Cells;

import java.util.ArrayList;
import java.util.HashMap;
public final class i4 {
    public ArrayList f22263a;
    public ArrayList f22264b;
    public HashMap f22265c;
    public int d;
    public int f22266e;
    public int f22267f;
    public float f22268g;
    public int h;
    public float f22269i;

    public final float a(float[] fArr, int i10, int i11) {
        float f7 = 0.0f;
        while (i10 < i11) {
            f7 += fArr[i10];
            i10++;
        }
        return this.h / f7;
    }
}
