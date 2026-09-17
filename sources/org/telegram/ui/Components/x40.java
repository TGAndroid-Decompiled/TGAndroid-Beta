package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class x40 {
    public long f32448a;
    public float f32449b;
    public float f32450c;
    public boolean d;
    public float f32451e;
    public final RectF f32452f = new RectF();
    public int f32453g;
    public final Paint h;
    public final int f32454i;

    public x40(int i10) {
        this.f32454i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
