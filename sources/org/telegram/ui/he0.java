package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
public final class he0 extends ReplacementSpan {
    public final String f47692a;
    public final boolean f47693b;
    public final TextPaint f47694c;
    public final Paint d;
    public final float f47695e;
    public final je0 f47696f;

    public he0(je0 je0Var, int i7, boolean z10) {
        this.f47696f = je0Var;
        TextPaint textPaint = new TextPaint(1);
        this.f47694c = textPaint;
        this.d = new Paint(1);
        String valueOf = String.valueOf(i7);
        this.f47692a = valueOf;
        this.f47693b = z10;
        textPaint.setTextSize(org.telegram.messenger.g0.N(11.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.f47695e = Math.max(org.telegram.messenger.g0.L(7.333f), textPaint.measureText(valueOf)) + org.telegram.messenger.g0.L(10.0f);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14;
        float L = f10 + org.telegram.messenger.g0.L(5.0f);
        float L2 = ((i11 + i13) / 2.0f) + org.telegram.messenger.g0.L(1.0f);
        float L3 = org.telegram.messenger.g0.L(17.333f) / 2.0f;
        if (this.f47693b) {
            i14 = org.telegram.ui.ActionBar.j6.Fi;
        } else {
            i14 = org.telegram.ui.ActionBar.j6.U9;
        }
        je0 je0Var = this.f47696f;
        int themedColor = je0Var.getThemedColor(i14);
        Paint paint2 = this.d;
        paint2.setColor(themedColor);
        int themedColor2 = je0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f29129s8);
        TextPaint textPaint = this.f47694c;
        textPaint.setColor(themedColor2);
        RectF rectF = org.telegram.messenger.g0.P;
        float f11 = this.f47695e;
        rectF.set(L, L2 - L3, L + f11, L2 + L3);
        canvas.drawRoundRect(rectF, L3, L3, paint2);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f12 = L2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
        String str = this.f47692a;
        canvas.drawText(str, ((f11 - textPaint.measureText(str)) / 2.0f) + L, f12, textPaint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (int) Math.ceil(org.telegram.messenger.g0.L(5.0f) + this.f47695e);
    }
}
