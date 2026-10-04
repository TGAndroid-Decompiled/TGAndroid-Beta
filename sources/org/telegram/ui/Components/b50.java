package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class b50 {
    public long f24794a;
    public float f24795b;
    public float f24796c;
    public boolean d;
    public float f24797e;
    public final RectF f24798f = new RectF();
    public int f24799g;
    public final Paint h;
    public final int f24800i;

    public b50(int i10) {
        this.f24800i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
