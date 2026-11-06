package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
public final class fz extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.f6 f45749a;
    public final Paint f45750b;
    public final int f45751c;
    public final org.telegram.ui.Components.ly0 d;

    public fz(String str, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint(1);
        this.f45750b = paint;
        this.f45749a = f6Var;
        this.f45751c = i7;
        this.d = new org.telegram.ui.Components.ly0(str, 9.33f, org.telegram.messenger.g0.o());
        paint.setStyle(Paint.Style.FILL);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(this.f45751c, this.f45749a);
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.15f, w02);
        Paint paint2 = this.f45750b;
        paint2.setColor(r12);
        float f11 = (i13 + i11) / 2.0f;
        RectF rectF = org.telegram.messenger.g0.P;
        float L = org.telegram.messenger.g0.L(14.66f) / 2.0f;
        rectF.set(f10, f11 - L, this.d.k() + f10 + org.telegram.messenger.g0.L(9.33f), L + f11);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint2);
        this.d.c(f10 + org.telegram.messenger.g0.L(4.66f), f11, 1.0f, w02, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.d.k() + org.telegram.messenger.g0.L(9.33f));
    }
}
