package org.telegram.ui.Cells;

import java.util.ArrayList;
import java.util.HashMap;
public final class i4 {
    public ArrayList f22965a;
    public ArrayList f22966b;
    public HashMap f22967c;
    public int d;
    public int f22968e;
    public int f22969f;
    public float f22970g;
    public int h;
    public float f22971i;

    public final float a(float[] fArr, int i10, int i11) {
        float f10 = 0.0f;
        while (i10 < i11) {
            f10 += fArr[i10];
            i10++;
        }
        return this.h / f10;
    }
}
