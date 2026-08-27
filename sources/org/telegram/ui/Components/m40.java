package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;

public final class m40 {

    public long f30553a;

    public float f30554b;

    public float f30555c;
    public boolean d;

    public float f30556e;

    public final RectF f30557f = new RectF();

    public int f30558g;
    public final Paint h;

    public final int f30559i;

    public m40(int i10) {
        this.f30559i = i10;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
