package org.telegram.ui.Cells;

import java.util.ArrayList;
import java.util.HashMap;
public final class i4 {
    public ArrayList f19300a;
    public ArrayList f19301b;
    public HashMap f19302c;
    public int d;
    public int e;
    public int f19303f;
    public float f19304g;
    public int h;
    public float f19305i;

    public final float a(float[] fArr, int i10, int i11) {
        float f7 = 0.0f;
        while (i10 < i11) {
            f7 += fArr[i10];
            i10++;
        }
        return this.h / f7;
    }
}
