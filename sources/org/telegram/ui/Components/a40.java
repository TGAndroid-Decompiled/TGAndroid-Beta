package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class a40 {
    public long f33309a;
    public float f33310b;
    public float f33311c;
    public boolean d;
    public float f33312e;
    public final RectF f33313f = new RectF();
    public int f33314g;
    public final Paint h;
    public final int f33315i;

    public a40(int i7) {
        this.f33315i = i7;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
