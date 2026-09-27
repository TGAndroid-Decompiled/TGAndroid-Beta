package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class a50 {
    public long f22549a;
    public float f22550b;
    public float f22551c;
    public boolean d;
    public float e;
    public final RectF f22552f = new RectF();
    public int f22553g;
    public final Paint h;
    public final int f22554i;

    public a50(int i10) {
        this.f22554i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
