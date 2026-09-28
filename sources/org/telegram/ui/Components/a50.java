package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class a50 {
    public long f22546a;
    public float f22547b;
    public float f22548c;
    public boolean d;
    public float e;
    public final RectF f22549f = new RectF();
    public int f22550g;
    public final Paint h;
    public final int f22551i;

    public a50(int i10) {
        this.f22551i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
