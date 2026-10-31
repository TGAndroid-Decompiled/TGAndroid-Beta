package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class e40 {
    public long f25634a;
    public float f25635b;
    public float f25636c;
    public boolean d;
    public float e;
    public final RectF f25637f = new RectF();
    public int f25638g;
    public final Paint h;
    public final int f25639i;

    public e40(int i10) {
        this.f25639i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
