package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class e40 {
    public long f25676a;
    public float f25677b;
    public float f25678c;
    public boolean d;
    public float e;
    public final RectF f25679f = new RectF();
    public int f25680g;
    public final Paint h;
    public final int f25681i;

    public e40(int i10) {
        this.f25681i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
