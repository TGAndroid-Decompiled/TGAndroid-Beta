package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
public final class dz extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.e6 f44837a;
    public final Paint f44838b;
    public final int f44839c;
    public final org.telegram.ui.Components.ly0 d;

    public dz(String str, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        Paint paint = new Paint(1);
        this.f44838b = paint;
        this.f44837a = e6Var;
        this.f44839c = i3;
        this.d = new org.telegram.ui.Components.ly0(str, 9.33f, org.telegram.messenger.g0.o());
        paint.setStyle(Paint.Style.FILL);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(this.f44839c, this.f44837a);
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.15f, w02);
        Paint paint2 = this.f44838b;
        paint2.setColor(r12);
        float f11 = (i13 + i11) / 2.0f;
        RectF rectF = org.telegram.messenger.g0.P;
        float L = org.telegram.messenger.g0.L(14.66f) / 2.0f;
        rectF.set(f10, f11 - L, this.d.k() + f10 + org.telegram.messenger.g0.L(9.33f), L + f11);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint2);
        this.d.c(f10 + org.telegram.messenger.g0.L(4.66f), f11, 1.0f, w02, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.d.k() + org.telegram.messenger.g0.L(9.33f));
    }
}
