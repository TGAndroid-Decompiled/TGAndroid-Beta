package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class m30 {
    public long f35874a;
    public float f35875b;
    public float f35876c;
    public boolean d;
    public float f35877e;
    public final RectF f35878f = new RectF();
    public int f35879g;
    public final Paint h;
    public final int f35880i;

    public m30(int i7) {
        this.f35880i = i7;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
