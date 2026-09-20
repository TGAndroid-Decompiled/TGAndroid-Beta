package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class x40 {
    public long f30160a;
    public float f30161b;
    public float f30162c;
    public boolean d;
    public float e;
    public final RectF f30163f = new RectF();
    public int f30164g;
    public final Paint h;
    public final int f30165i;

    public x40(int i10) {
        this.f30165i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
