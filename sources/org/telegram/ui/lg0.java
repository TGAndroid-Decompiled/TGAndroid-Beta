package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class lg0 extends ReplacementSpan {
    public final String f38910a;
    public final boolean f38911b;
    public final TextPaint f38912c;
    public final Paint d;
    public final float e;
    public final ng0 f38913f;

    public lg0(ng0 ng0Var, int i10, boolean z10) {
        this.f38913f = ng0Var;
        TextPaint textPaint = new TextPaint(1);
        this.f38912c = textPaint;
        this.d = new Paint(1);
        String valueOf = String.valueOf(i10);
        this.f38910a = valueOf;
        this.f38911b = z10;
        textPaint.setTextSize(AndroidUtilities.dpf2(11.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.e = Math.max(AndroidUtilities.dp(7.333f), textPaint.measureText(valueOf)) + AndroidUtilities.dp(10.0f);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15;
        float dp = f7 + AndroidUtilities.dp(5.0f);
        float dp2 = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.0f);
        float dp3 = AndroidUtilities.dp(17.333f) / 2.0f;
        if (this.f38911b) {
            i15 = org.telegram.ui.ActionBar.h6.Oh;
        } else {
            i15 = org.telegram.ui.ActionBar.h6.U9;
        }
        ng0 ng0Var = this.f38913f;
        int themedColor = ng0Var.getThemedColor(i15);
        Paint paint2 = this.d;
        paint2.setColor(themedColor);
        int themedColor2 = ng0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21266s8);
        TextPaint textPaint = this.f38912c;
        textPaint.setColor(themedColor2);
        RectF rectF = AndroidUtilities.rectTmp;
        float f10 = this.e;
        rectF.set(dp, dp2 - dp3, dp + f10, dp2 + dp3);
        canvas.drawRoundRect(rectF, dp3, dp3, paint2);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f11 = dp2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
        String str = this.f38910a;
        canvas.drawText(str, ((f10 - textPaint.measureText(str)) / 2.0f) + dp, f11, textPaint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) Math.ceil(AndroidUtilities.dp(5.0f) + this.e);
    }
}
