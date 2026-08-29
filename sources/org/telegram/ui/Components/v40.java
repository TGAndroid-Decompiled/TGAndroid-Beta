package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class v40 {
    public long f33452a;
    public float f33453b;
    public float f33454c;
    public boolean d;
    public float f33455e;
    public final RectF f33456f = new RectF();
    public int f33457g;
    public final Paint h;
    public final int f33458i;

    public v40(int i10) {
        this.f33458i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
