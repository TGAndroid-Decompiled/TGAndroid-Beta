package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;

public final class og0 extends ReplacementSpan {

    public final String f41087a;

    public final boolean f41088b;

    public final TextPaint f41089c;
    public final Paint d;

    public final float f41090e;

    public final qg0 f41091f;

    public og0(qg0 qg0Var, int i10, boolean z10) {
        this.f41091f = qg0Var;
        TextPaint textPaint = new TextPaint(1);
        this.f41089c = textPaint;
        this.d = new Paint(1);
        String strValueOf = String.valueOf(i10);
        this.f41087a = strValueOf;
        this.f41088b = z10;
        textPaint.setTextSize(AndroidUtilities.dpf2(11.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f41090e = Math.max(AndroidUtilities.dp(7.333f), textPaint.measureText(strValueOf)) + AndroidUtilities.dp(10.0f);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        float fDp = f10 + AndroidUtilities.dp(5.0f);
        float fDp2 = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.0f);
        float fDp3 = AndroidUtilities.dp(17.333f) / 2.0f;
        int i15 = this.f41088b ? org.telegram.ui.ActionBar.g6.Oh : org.telegram.ui.ActionBar.g6.U9;
        qg0 qg0Var = this.f41091f;
        int themedColor = qg0Var.getThemedColor(i15);
        Paint paint2 = this.d;
        paint2.setColor(themedColor);
        int themedColor2 = qg0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23322s8);
        TextPaint textPaint = this.f41089c;
        textPaint.setColor(themedColor2);
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = this.f41090e;
        rectF.set(fDp, fDp2 - fDp3, fDp + f11, fDp2 + fDp3);
        canvas.drawRoundRect(rectF, fDp3, fDp3, paint2);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f12 = fDp2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
        String str = this.f41087a;
        canvas.drawText(str, ((f11 - textPaint.measureText(str)) / 2.0f) + fDp, f12, textPaint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) Math.ceil(AndroidUtilities.dp(5.0f) + this.f41090e);
    }
}
