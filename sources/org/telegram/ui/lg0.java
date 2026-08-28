package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class lg0 extends ReplacementSpan {
    public final String f40133a;
    public final boolean f40134b;
    public final TextPaint f40135c;
    public final Paint d;
    public final float f40136e;
    public final ng0 f40137f;

    public lg0(ng0 ng0Var, int i9, boolean z10) {
        this.f40137f = ng0Var;
        TextPaint textPaint = new TextPaint(1);
        this.f40135c = textPaint;
        this.d = new Paint(1);
        String valueOf = String.valueOf(i9);
        this.f40133a = valueOf;
        this.f40134b = z10;
        textPaint.setTextSize(AndroidUtilities.dpf2(11.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f40136e = Math.max(AndroidUtilities.dp(7.333f), textPaint.measureText(valueOf)) + AndroidUtilities.dp(10.0f);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14;
        float dp = f10 + AndroidUtilities.dp(5.0f);
        float dp2 = ((i11 + i13) / 2.0f) + AndroidUtilities.dp(1.0f);
        float dp3 = AndroidUtilities.dp(17.333f) / 2.0f;
        if (this.f40134b) {
            i14 = org.telegram.ui.ActionBar.f6.Oh;
        } else {
            i14 = org.telegram.ui.ActionBar.f6.U9;
        }
        ng0 ng0Var = this.f40137f;
        int themedColor = ng0Var.getThemedColor(i14);
        Paint paint2 = this.d;
        paint2.setColor(themedColor);
        int themedColor2 = ng0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23269s8);
        TextPaint textPaint = this.f40135c;
        textPaint.setColor(themedColor2);
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = this.f40136e;
        rectF.set(dp, dp2 - dp3, dp + f11, dp2 + dp3);
        canvas.drawRoundRect(rectF, dp3, dp3, paint2);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f12 = dp2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
        String str = this.f40133a;
        canvas.drawText(str, ((f11 - textPaint.measureText(str)) / 2.0f) + dp, f12, textPaint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (int) Math.ceil(AndroidUtilities.dp(5.0f) + this.f40136e);
    }
}
