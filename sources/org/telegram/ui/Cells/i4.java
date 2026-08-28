package org.telegram.ui.Cells;

import java.util.ArrayList;
import java.util.HashMap;
public final class i4 {
    public ArrayList f24503a;
    public ArrayList f24504b;
    public HashMap f24505c;
    public int d;
    public int f24506e;
    public int f24507f;
    public float f24508g;
    public int h;
    public float f24509i;

    public final float a(float[] fArr, int i9, int i10) {
        float f10 = 0.0f;
        while (i9 < i10) {
            f10 += fArr[i9];
            i9++;
        }
        return this.h / f10;
    }
}
