package org.telegram.ui.Cells;

import java.util.ArrayList;
import java.util.HashMap;
public final class i4 {
    public ArrayList f21308a;
    public ArrayList f21309b;
    public HashMap f21310c;
    public int d;
    public int e;
    public int f21311f;
    public float f21312g;
    public int h;
    public float f21313i;

    public final float a(float[] fArr, int i10, int i11) {
        float f7 = 0.0f;
        while (i10 < i11) {
            f7 += fArr[i10];
            i10++;
        }
        return this.h / f7;
    }
}
