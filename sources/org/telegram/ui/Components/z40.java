package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class z40 {
    public long f31231a;
    public float f31232b;
    public float f31233c;
    public boolean d;
    public float e;
    public final RectF f31234f = new RectF();
    public int f31235g;
    public final Paint h;
    public final int f31236i;

    public z40(int i10) {
        this.f31236i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
