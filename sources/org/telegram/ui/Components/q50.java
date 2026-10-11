package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class q50 {
    public long f30005a;
    public float f30006b;
    public float f30007c;
    public boolean d;
    public float f30008e;
    public final RectF f30009f = new RectF();
    public int f30010g;
    public final Paint h;
    public final int f30011i;

    public q50(int i10) {
        this.f30011i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
