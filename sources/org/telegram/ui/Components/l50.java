package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class l50 {
    public long f26615a;
    public float f26616b;
    public float f26617c;
    public boolean d;
    public float e;
    public final RectF f26618f = new RectF();
    public int f26619g;
    public final Paint h;
    public final int f26620i;

    public l50(int i10) {
        this.f26620i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
