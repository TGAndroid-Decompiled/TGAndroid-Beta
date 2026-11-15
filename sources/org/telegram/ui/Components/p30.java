package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class p30 {
    public long f38186a;
    public float f38187b;
    public float f38188c;
    public boolean d;
    public float f38189e;
    public final RectF f38190f = new RectF();
    public int f38191g;
    public final Paint h;
    public final int f38192i;

    public p30(int i7) {
        this.f38192i = i7;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
