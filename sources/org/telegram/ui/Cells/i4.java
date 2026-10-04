package org.telegram.ui.Cells;

import java.util.ArrayList;
import java.util.HashMap;
public final class i4 {
    public ArrayList f22235a;
    public ArrayList f22236b;
    public HashMap f22237c;
    public int d;
    public int f22238e;
    public int f22239f;
    public float f22240g;
    public int h;
    public float f22241i;

    public final float a(float[] fArr, int i10, int i11) {
        float f7 = 0.0f;
        while (i10 < i11) {
            f7 += fArr[i10];
            i10++;
        }
        return this.h / f7;
    }
}
