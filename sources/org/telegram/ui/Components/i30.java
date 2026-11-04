package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
public final class i30 {
    public long f34576a;
    public float f34577b;
    public float f34578c;
    public boolean d;
    public float f34579e;
    public final RectF f34580f = new RectF();
    public int f34581g;
    public final Paint h;
    public final int f34582i;

    public i30(int i3) {
        this.f34582i = i3;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
