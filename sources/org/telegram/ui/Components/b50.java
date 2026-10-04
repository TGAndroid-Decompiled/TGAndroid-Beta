package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class b50 {
    public long f24790a;
    public float f24791b;
    public float f24792c;
    public boolean d;
    public float f24793e;
    public final RectF f24794f = new RectF();
    public int f24795g;
    public final Paint h;
    public final int f24796i;

    public b50(int i10) {
        this.f24796i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
