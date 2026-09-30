package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class b50 {
    public long f22818a;
    public float f22819b;
    public float f22820c;
    public boolean d;
    public float e;
    public final RectF f22821f = new RectF();
    public int f22822g;
    public final Paint h;
    public final int f22823i;

    public b50(int i10) {
        this.f22823i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
