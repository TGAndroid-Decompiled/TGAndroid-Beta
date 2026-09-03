package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class b50 {
    public long f25505a;
    public float f25506b;
    public float f25507c;
    public boolean d;
    public float f25508e;
    public final RectF f25509f = new RectF();
    public int f25510g;
    public final Paint h;
    public final int f25511i;

    public b50(int i10) {
        this.f25511i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
