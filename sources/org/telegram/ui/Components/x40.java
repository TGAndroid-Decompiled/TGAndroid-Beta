package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class x40 {
    public long f30213a;
    public float f30214b;
    public float f30215c;
    public boolean d;
    public float e;
    public final RectF f30216f = new RectF();
    public int f30217g;
    public final Paint h;
    public final int f30218i;

    public x40(int i10) {
        this.f30218i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
