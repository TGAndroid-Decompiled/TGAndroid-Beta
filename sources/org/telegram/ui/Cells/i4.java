package org.telegram.ui.Cells;

import java.util.ArrayList;
import java.util.HashMap;
public final class i4 {
    public ArrayList f22239a;
    public ArrayList f22240b;
    public HashMap f22241c;
    public int d;
    public int f22242e;
    public int f22243f;
    public float f22244g;
    public int h;
    public float f22245i;

    public final float a(float[] fArr, int i10, int i11) {
        float f7 = 0.0f;
        while (i10 < i11) {
            f7 += fArr[i10];
            i10++;
        }
        return this.h / f7;
    }
}
