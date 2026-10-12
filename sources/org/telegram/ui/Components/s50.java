package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class s50 {
    public long f30408a;
    public float f30409b;
    public float f30410c;
    public boolean d;
    public float f30411e;
    public final RectF f30412f = new RectF();
    public int f30413g;
    public final Paint h;
    public final int f30414i;

    public s50(int i10) {
        this.f30414i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
