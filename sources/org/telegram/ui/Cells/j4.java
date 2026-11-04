package org.telegram.ui.Cells;

import java.util.ArrayList;
import java.util.HashMap;
public final class j4 {
    public ArrayList f29423a;
    public ArrayList f29424b;
    public HashMap f29425c;
    public int d;
    public int f29426e;
    public int f29427f;
    public float f29428g;
    public int h;
    public float f29429i;

    public final float a(int i3, int i10, float[] fArr) {
        float f10 = 0.0f;
        while (i3 < i10) {
            f10 += fArr[i3];
            i3++;
        }
        return this.h / f10;
    }
}
