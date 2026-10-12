package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class s50 {
    public long f30412a;
    public float f30413b;
    public float f30414c;
    public boolean d;
    public float f30415e;
    public final RectF f30416f = new RectF();
    public int f30417g;
    public final Paint h;
    public final int f30418i;

    public s50(int i10) {
        this.f30418i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
