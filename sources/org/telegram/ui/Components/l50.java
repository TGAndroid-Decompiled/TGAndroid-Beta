package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class l50 {
    public long f26935a;
    public float f26936b;
    public float f26937c;
    public boolean d;
    public float e;
    public final RectF f26938f = new RectF();
    public int f26939g;
    public final Paint h;
    public final int f26940i;

    public l50(int i10) {
        this.f26940i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
