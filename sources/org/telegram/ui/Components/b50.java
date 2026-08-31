package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class b50 {
    public long f25486a;
    public float f25487b;
    public float f25488c;
    public boolean d;
    public float f25489e;
    public final RectF f25490f = new RectF();
    public int f25491g;
    public final Paint h;
    public final int f25492i;

    public b50(int i10) {
        this.f25492i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
