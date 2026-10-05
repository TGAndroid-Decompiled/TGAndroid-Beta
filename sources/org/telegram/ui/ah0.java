package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class ah0 extends ReplacementSpan {
    public final String f34874a;
    public final boolean f34875b;
    public final TextPaint f34876c;
    public final Paint d;
    public final float f34877e;
    public final ch0 f34878f;

    public ah0(ch0 ch0Var, int i10, boolean z10) {
        this.f34878f = ch0Var;
        TextPaint textPaint = new TextPaint(1);
        this.f34876c = textPaint;
        this.d = new Paint(1);
        String valueOf = String.valueOf(i10);
        this.f34874a = valueOf;
        this.f34875b = z10;
        textPaint.setTextSize(AndroidUtilities.dpf2(11.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f34877e = Math.max(AndroidUtilities.dp(7.333f), textPaint.measureText(valueOf)) + AndroidUtilities.dp(10.0f);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15;
        float dp = f7 + AndroidUtilities.dp(5.0f);
        float dp2 = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.0f);
        float dp3 = AndroidUtilities.dp(17.333f) / 2.0f;
        if (this.f34875b) {
            i15 = org.telegram.ui.ActionBar.i6.Oh;
        } else {
            i15 = org.telegram.ui.ActionBar.i6.U9;
        }
        ch0 ch0Var = this.f34878f;
        int themedColor = ch0Var.getThemedColor(i15);
        Paint paint2 = this.d;
        paint2.setColor(themedColor);
        int themedColor2 = ch0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21109s8);
        TextPaint textPaint = this.f34876c;
        textPaint.setColor(themedColor2);
        RectF rectF = AndroidUtilities.rectTmp;
        float f10 = this.f34877e;
        rectF.set(dp, dp2 - dp3, dp + f10, dp2 + dp3);
        canvas.drawRoundRect(rectF, dp3, dp3, paint2);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f11 = dp2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
        String str = this.f34874a;
        canvas.drawText(str, ((f10 - textPaint.measureText(str)) / 2.0f) + dp, f11, textPaint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) Math.ceil(AndroidUtilities.dp(5.0f) + this.f34877e);
    }
}
