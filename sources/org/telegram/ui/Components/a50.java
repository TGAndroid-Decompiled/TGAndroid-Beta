package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class a50 {
    public long f22547a;
    public float f22548b;
    public float f22549c;
    public boolean d;
    public float e;
    public final RectF f22550f = new RectF();
    public int f22551g;
    public final Paint h;
    public final int f22552i;

    public a50(int i10) {
        this.f22552i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
