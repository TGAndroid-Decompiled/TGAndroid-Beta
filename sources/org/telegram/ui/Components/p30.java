package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class p30 {
    public long f38184a;
    public float f38185b;
    public float f38186c;
    public boolean d;
    public float f38187e;
    public final RectF f38188f = new RectF();
    public int f38189g;
    public final Paint h;
    public final int f38190i;

    public p30(int i7) {
        this.f38190i = i7;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
