package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class a40 {
    public long f33296a;
    public float f33297b;
    public float f33298c;
    public boolean d;
    public float f33299e;
    public final RectF f33300f = new RectF();
    public int f33301g;
    public final Paint h;
    public final int f33302i;

    public a40(int i7) {
        this.f33302i = i7;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
