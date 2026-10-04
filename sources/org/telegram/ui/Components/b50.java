package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class b50 {
    public long f24789a;
    public float f24790b;
    public float f24791c;
    public boolean d;
    public float f24792e;
    public final RectF f24793f = new RectF();
    public int f24794g;
    public final Paint h;
    public final int f24795i;

    public b50(int i10) {
        this.f24795i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
