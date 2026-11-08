package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class fs extends ReplacementSpan {
    public int f33640b;
    public final Paint f33639a = new Paint(1);
    public float f33641c = 3.0f;
    public float d = 3.0f;

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int color = paint.getColor();
        Paint paint2 = this.f33639a;
        if (color != 0) {
            paint2.setColor(paint.getColor());
        }
        canvas.drawCircle(f10 + (org.telegram.messenger.g0.N(this.f33641c) / 2.0f), ((i13 - i11) / 2) + this.f33640b, org.telegram.messenger.g0.N(this.d) / 2.0f, paint2);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return org.telegram.messenger.g0.L(this.f33641c);
    }
}
