package org.telegram.ui.Cells;

import java.util.ArrayList;
import java.util.HashMap;
public final class i4 {
    public ArrayList f20387a;
    public ArrayList f20388b;
    public HashMap f20389c;
    public int d;
    public int e;
    public int f20390f;
    public float f20391g;
    public int h;
    public float f20392i;

    public final float a(float[] fArr, int i10, int i11) {
        float f7 = 0.0f;
        while (i10 < i11) {
            f7 += fArr[i10];
            i10++;
        }
        return this.h / f7;
    }
}
