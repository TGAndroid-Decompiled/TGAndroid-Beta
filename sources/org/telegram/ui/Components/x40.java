package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class x40 {
    public long f30229a;
    public float f30230b;
    public float f30231c;
    public boolean d;
    public float e;
    public final RectF f30232f = new RectF();
    public int f30233g;
    public final Paint h;
    public final int f30234i;

    public x40(int i10) {
        this.f30234i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
