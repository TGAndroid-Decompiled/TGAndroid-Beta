package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class x40 {
    public long f32420a;
    public float f32421b;
    public float f32422c;
    public boolean d;
    public float f32423e;
    public final RectF f32424f = new RectF();
    public int f32425g;
    public final Paint h;
    public final int f32426i;

    public x40(int i10) {
        this.f32426i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
