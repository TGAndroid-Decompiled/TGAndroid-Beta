package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
public final class ke0 extends ReplacementSpan {
    public final String f49298a;
    public final boolean f49299b;
    public final TextPaint f49300c;
    public final Paint d;
    public final float f49301e;
    public final me0 f49302f;

    public ke0(me0 me0Var, int i7, boolean z10) {
        this.f49302f = me0Var;
        TextPaint textPaint = new TextPaint(1);
        this.f49300c = textPaint;
        this.d = new Paint(1);
        String valueOf = String.valueOf(i7);
        this.f49298a = valueOf;
        this.f49299b = z10;
        textPaint.setTextSize(org.telegram.messenger.g0.N(11.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.f49301e = Math.max(org.telegram.messenger.g0.L(7.333f), textPaint.measureText(valueOf)) + org.telegram.messenger.g0.L(10.0f);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14;
        float L = f10 + org.telegram.messenger.g0.L(5.0f);
        float L2 = ((i11 + i13) / 2.0f) + org.telegram.messenger.g0.L(1.0f);
        float L3 = org.telegram.messenger.g0.L(17.333f) / 2.0f;
        if (this.f49299b) {
            i14 = org.telegram.ui.ActionBar.m6.Fi;
        } else {
            i14 = org.telegram.ui.ActionBar.m6.U9;
        }
        me0 me0Var = this.f49302f;
        int themedColor = me0Var.getThemedColor(i14);
        Paint paint2 = this.d;
        paint2.setColor(themedColor);
        int themedColor2 = me0Var.getThemedColor(org.telegram.ui.ActionBar.m6.f29661s8);
        TextPaint textPaint = this.f49300c;
        textPaint.setColor(themedColor2);
        RectF rectF = org.telegram.messenger.g0.P;
        float f11 = this.f49301e;
        rectF.set(L, L2 - L3, L + f11, L2 + L3);
        canvas.drawRoundRect(rectF, L3, L3, paint2);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f12 = L2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
        String str = this.f49298a;
        canvas.drawText(str, ((f11 - textPaint.measureText(str)) / 2.0f) + L, f12, textPaint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (int) Math.ceil(org.telegram.messenger.g0.L(5.0f) + this.f49301e);
    }
}
