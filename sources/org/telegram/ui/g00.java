package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
public final class g00 extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.p6 f37265a;
    public final Paint f37266b;
    public final int f37267c;
    public final org.telegram.ui.Components.rz0 d;

    public g00(String str, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        Paint paint = new Paint(1);
        this.f37266b = paint;
        this.f37265a = p6Var;
        this.f37267c = i10;
        this.d = new org.telegram.ui.Components.rz0(str, 9.33f, org.telegram.messenger.i0.o());
        paint.setStyle(Paint.Style.FILL);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int w02 = org.telegram.ui.ActionBar.t6.w0(this.f37267c, this.f37265a);
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.15f, w02);
        Paint paint2 = this.f37266b;
        paint2.setColor(r12);
        float f10 = (i14 + i12) / 2.0f;
        RectF rectF = org.telegram.messenger.i0.P;
        float L = org.telegram.messenger.i0.L(14.66f) / 2.0f;
        rectF.set(f7, f10 - L, this.d.k() + f7 + org.telegram.messenger.i0.L(9.33f), L + f10);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint2);
        this.d.c(f7 + org.telegram.messenger.i0.L(4.66f), f10, 1.0f, w02, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.d.k() + org.telegram.messenger.i0.L(9.33f));
    }
}
