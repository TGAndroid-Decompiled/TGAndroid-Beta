package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
public final class ce0 extends ReplacementSpan {
    public final String f44324a;
    public final boolean f44325b;
    public final TextPaint f44326c;
    public final Paint d;
    public final float f44327e;
    public final ee0 f44328f;

    public ce0(ee0 ee0Var, int i3, boolean z10) {
        this.f44328f = ee0Var;
        TextPaint textPaint = new TextPaint(1);
        this.f44326c = textPaint;
        this.d = new Paint(1);
        String valueOf = String.valueOf(i3);
        this.f44324a = valueOf;
        this.f44325b = z10;
        textPaint.setTextSize(org.telegram.messenger.g0.N(11.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.f44327e = Math.max(org.telegram.messenger.g0.L(7.333f), textPaint.measureText(valueOf)) + org.telegram.messenger.g0.L(10.0f);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14;
        float L = f10 + org.telegram.messenger.g0.L(5.0f);
        float L2 = ((i11 + i13) / 2.0f) + org.telegram.messenger.g0.L(1.0f);
        float L3 = org.telegram.messenger.g0.L(17.333f) / 2.0f;
        if (this.f44325b) {
            i14 = org.telegram.ui.ActionBar.k6.Ci;
        } else {
            i14 = org.telegram.ui.ActionBar.k6.U9;
        }
        ee0 ee0Var = this.f44328f;
        int themedColor = ee0Var.getThemedColor(i14);
        Paint paint2 = this.d;
        paint2.setColor(themedColor);
        int themedColor2 = ee0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f28160s8);
        TextPaint textPaint = this.f44326c;
        textPaint.setColor(themedColor2);
        RectF rectF = org.telegram.messenger.g0.P;
        float f11 = this.f44327e;
        rectF.set(L, L2 - L3, L + f11, L2 + L3);
        canvas.drawRoundRect(rectF, L3, L3, paint2);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f12 = L2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
        String str = this.f44324a;
        canvas.drawText(str, ((f11 - textPaint.measureText(str)) / 2.0f) + L, f12, textPaint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (int) Math.ceil(org.telegram.messenger.g0.L(5.0f) + this.f44327e);
    }
}
