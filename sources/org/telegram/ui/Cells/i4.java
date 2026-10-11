package org.telegram.ui.Cells;

import java.util.ArrayList;
import java.util.HashMap;
public final class i4 {
    public ArrayList f22227a;
    public ArrayList f22228b;
    public HashMap f22229c;
    public int d;
    public int f22230e;
    public int f22231f;
    public float f22232g;
    public int h;
    public float f22233i;

    public final float a(float[] fArr, int i10, int i11) {
        float f7 = 0.0f;
        while (i10 < i11) {
            f7 += fArr[i10];
            i10++;
        }
        return this.h / f7;
    }
}
