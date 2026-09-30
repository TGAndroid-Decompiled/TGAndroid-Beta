package org.telegram.ui.Cells;

import java.util.ArrayList;
import java.util.HashMap;
public final class i4 {
    public ArrayList f20440a;
    public ArrayList f20441b;
    public HashMap f20442c;
    public int d;
    public int e;
    public int f20443f;
    public float f20444g;
    public int h;
    public float f20445i;

    public final float a(float[] fArr, int i10, int i11) {
        float f7 = 0.0f;
        while (i10 < i11) {
            f7 += fArr[i10];
            i10++;
        }
        return this.h / f7;
    }
}
