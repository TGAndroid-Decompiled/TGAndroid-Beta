package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class f50 {
    public long f26198a;
    public float f26199b;
    public float f26200c;
    public boolean d;
    public float e;
    public final RectF f26201f = new RectF();
    public int f26202g;
    public final Paint h;
    public final int f26203i;

    public f50(int i10) {
        this.f26203i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
