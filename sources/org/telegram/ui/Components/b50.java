package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class b50 {
    public long f24836a;
    public float f24837b;
    public float f24838c;
    public boolean d;
    public float f24839e;
    public final RectF f24840f = new RectF();
    public int f24841g;
    public final Paint h;
    public final int f24842i;

    public b50(int i10) {
        this.f24842i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
