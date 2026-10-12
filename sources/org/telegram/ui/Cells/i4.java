package org.telegram.ui.Cells;

import java.util.ArrayList;
import java.util.HashMap;
public final class i4 {
    public ArrayList f21998a;
    public ArrayList f21999b;
    public HashMap f22000c;
    public int d;
    public int f22001e;
    public int f22002f;
    public float f22003g;
    public int h;
    public float f22004i;

    public final float a(float[] fArr, int i10, int i11) {
        float f7 = 0.0f;
        while (i10 < i11) {
            f7 += fArr[i10];
            i10++;
        }
        return this.h / f7;
    }
}
