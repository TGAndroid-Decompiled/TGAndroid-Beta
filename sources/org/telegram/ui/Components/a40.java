package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class a40 {
    public long f33275a;
    public float f33276b;
    public float f33277c;
    public boolean d;
    public float f33278e;
    public final RectF f33279f = new RectF();
    public int f33280g;
    public final Paint h;
    public final int f33281i;

    public a40(int i7) {
        this.f33281i = i7;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
