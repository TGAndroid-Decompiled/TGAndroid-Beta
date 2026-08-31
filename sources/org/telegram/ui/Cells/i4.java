package org.telegram.ui.Cells;

import java.util.ArrayList;
import java.util.HashMap;
public final class i4 {
    public ArrayList f22963a;
    public ArrayList f22964b;
    public HashMap f22965c;
    public int d;
    public int f22966e;
    public int f22967f;
    public float f22968g;
    public int h;
    public float f22969i;

    public final float a(float[] fArr, int i10, int i11) {
        float f10 = 0.0f;
        while (i10 < i11) {
            f10 += fArr[i10];
            i10++;
        }
        return this.h / f10;
    }
}
