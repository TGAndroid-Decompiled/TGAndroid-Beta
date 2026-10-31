package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
public final class nf0 extends ReplacementSpan {
    public final String f39929a;
    public final boolean f39930b;
    public final TextPaint f39931c;
    public final Paint d;
    public final float e;
    public final pf0 f39932f;

    public nf0(pf0 pf0Var, int i10, boolean z10) {
        this.f39932f = pf0Var;
        TextPaint textPaint = new TextPaint(1);
        this.f39931c = textPaint;
        this.d = new Paint(1);
        String valueOf = String.valueOf(i10);
        this.f39929a = valueOf;
        this.f39930b = z10;
        textPaint.setTextSize(org.telegram.messenger.i0.N(11.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        this.e = Math.max(org.telegram.messenger.i0.L(7.333f), textPaint.measureText(valueOf)) + org.telegram.messenger.i0.L(10.0f);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15;
        float L = f7 + org.telegram.messenger.i0.L(5.0f);
        float L2 = ((i12 + i14) / 2.0f) + org.telegram.messenger.i0.L(1.0f);
        float L3 = org.telegram.messenger.i0.L(17.333f) / 2.0f;
        if (this.f39930b) {
            i15 = org.telegram.ui.ActionBar.t6.Ci;
        } else {
            i15 = org.telegram.ui.ActionBar.t6.U9;
        }
        pf0 pf0Var = this.f39932f;
        int themedColor = pf0Var.getThemedColor(i15);
        Paint paint2 = this.d;
        paint2.setColor(themedColor);
        int themedColor2 = pf0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f21206s8);
        TextPaint textPaint = this.f39931c;
        textPaint.setColor(themedColor2);
        RectF rectF = org.telegram.messenger.i0.P;
        float f10 = this.e;
        rectF.set(L, L2 - L3, L + f10, L2 + L3);
        canvas.drawRoundRect(rectF, L3, L3, paint2);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f11 = L2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
        String str = this.f39929a;
        canvas.drawText(str, ((f10 - textPaint.measureText(str)) / 2.0f) + L, f11, textPaint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) Math.ceil(org.telegram.messenger.i0.L(5.0f) + this.e);
    }
}
