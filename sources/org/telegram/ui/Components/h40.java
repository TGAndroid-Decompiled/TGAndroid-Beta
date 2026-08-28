package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class h40 {
    public long f28960a;
    public float f28961b;
    public float f28962c;
    public boolean d;
    public float f28963e;
    public final RectF f28964f = new RectF();
    public int f28965g;
    public final Paint h;
    public final int f28966i;

    public h40(int i9) {
        this.f28966i = i9;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
