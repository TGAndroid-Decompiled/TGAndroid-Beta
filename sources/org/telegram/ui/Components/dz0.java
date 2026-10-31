package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class dz0 extends ReplacementSpan {
    public float f25570a;
    public final String f25571b;
    public final int f25572c;
    public final Paint d;

    public dz0(int i10, Paint paint, String str) {
        this.f25571b = str;
        this.f25572c = i10;
        this.d = paint;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float f10 = (i12 + i14) / 2.0f;
        paint.setColor(this.f25572c);
        float L = org.telegram.messenger.i0.L(19.0f) / 2.0f;
        canvas.drawRoundRect(f7, f10 - L, f7 + this.f25570a + org.telegram.messenger.i0.L(11.33f), f10 + L, L, L, this.d);
        canvas.drawText(this.f25571b, org.telegram.messenger.i0.N(5.66f) + f7, i14 - org.telegram.messenger.i0.L(6.0f), paint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        float N = org.telegram.messenger.i0.N(11.33f);
        float measureText = paint.measureText(this.f25571b);
        this.f25570a = measureText;
        return (int) (N + measureText);
    }
}
