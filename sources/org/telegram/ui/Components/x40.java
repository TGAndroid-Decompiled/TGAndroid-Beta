package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class x40 {
    public long f32447a;
    public float f32448b;
    public float f32449c;
    public boolean d;
    public float f32450e;
    public final RectF f32451f = new RectF();
    public int f32452g;
    public final Paint h;
    public final int f32453i;

    public x40(int i10) {
        this.f32453i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
