package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class jy0 extends ReplacementSpan {
    public float f36563a;
    public final String f36564b;
    public final int f36565c;
    public final Paint d;

    public jy0(int i7, Paint paint, String str) {
        this.f36564b = str;
        this.f36565c = i7;
        this.d = paint;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float f11 = (i11 + i13) / 2.0f;
        paint.setColor(this.f36565c);
        float L = org.telegram.messenger.g0.L(19.0f) / 2.0f;
        canvas.drawRoundRect(f10, f11 - L, f10 + this.f36563a + org.telegram.messenger.g0.L(11.33f), f11 + L, L, L, this.d);
        canvas.drawText(this.f36564b, org.telegram.messenger.g0.N(5.66f) + f10, i13 - org.telegram.messenger.g0.L(6.0f), paint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        float N = org.telegram.messenger.g0.N(11.33f);
        float measureText = paint.measureText(this.f36564b);
        this.f36563a = measureText;
        return (int) (N + measureText);
    }
}
