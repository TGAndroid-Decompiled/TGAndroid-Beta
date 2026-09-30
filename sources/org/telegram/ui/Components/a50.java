package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class a50 {
    public long f22548a;
    public float f22549b;
    public float f22550c;
    public boolean d;
    public float e;
    public final RectF f22551f = new RectF();
    public int f22552g;
    public final Paint h;
    public final int f22553i;

    public a50(int i10) {
        this.f22553i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
