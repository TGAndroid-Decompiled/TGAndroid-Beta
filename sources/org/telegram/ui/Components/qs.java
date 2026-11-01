package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class qs extends ReplacementSpan {
    public int f29781b;
    public final Paint f29780a = new Paint(1);
    public float f29782c = 3.0f;
    public float d = 3.0f;

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int color = paint.getColor();
        Paint paint2 = this.f29780a;
        if (color != 0) {
            paint2.setColor(paint.getColor());
        }
        canvas.drawCircle(f7 + (org.telegram.messenger.i0.N(this.f29782c) / 2.0f), ((i14 - i12) / 2) + this.f29781b, org.telegram.messenger.i0.N(this.d) / 2.0f, paint2);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return org.telegram.messenger.i0.L(this.f29782c);
    }
}
