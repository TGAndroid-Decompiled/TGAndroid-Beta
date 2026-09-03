package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class a50 {
    public long f23314a;
    public float f23315b;
    public float f23316c;
    public boolean d;
    public float e;
    public final RectF f23317f = new RectF();
    public int f23318g;
    public final Paint h;
    public final int f23319i;

    public a50(int i10) {
        this.f23319i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
