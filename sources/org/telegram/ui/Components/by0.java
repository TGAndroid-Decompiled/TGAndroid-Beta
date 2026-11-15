package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class by0 extends ReplacementSpan {
    public float f33430a;
    public final String f33431b;
    public final int f33432c;
    public final Paint d;

    public by0(int i7, Paint paint, String str) {
        this.f33431b = str;
        this.f33432c = i7;
        this.d = paint;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float f11 = (i11 + i13) / 2.0f;
        paint.setColor(this.f33432c);
        float L = org.telegram.messenger.g0.L(19.0f) / 2.0f;
        canvas.drawRoundRect(f10, f11 - L, f10 + this.f33430a + org.telegram.messenger.g0.L(11.33f), f11 + L, L, L, this.d);
        canvas.drawText(this.f33431b, org.telegram.messenger.g0.N(5.66f) + f10, i13 - org.telegram.messenger.g0.L(6.0f), paint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        float N = org.telegram.messenger.g0.N(11.33f);
        float measureText = paint.measureText(this.f33431b);
        this.f33430a = measureText;
        return (int) (N + measureText);
    }
}
