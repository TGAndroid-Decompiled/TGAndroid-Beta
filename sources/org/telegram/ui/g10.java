package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class g10 extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.c6 f37886a;
    public final Paint f37887b;
    public final int f37888c;
    public final org.telegram.ui.Components.r11 d;

    public g10(String str, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        Paint paint = new Paint(1);
        this.f37887b = paint;
        this.f37886a = c6Var;
        this.f37888c = i10;
        this.d = new org.telegram.ui.Components.r11(str, 9.33f, AndroidUtilities.bold());
        paint.setStyle(Paint.Style.FILL);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int w02 = org.telegram.ui.ActionBar.h6.w0(this.f37888c, this.f37886a);
        int m12 = org.telegram.ui.ActionBar.h6.m1(0.15f, w02);
        Paint paint2 = this.f37887b;
        paint2.setColor(m12);
        float f10 = (i14 + i12) / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        float dp = AndroidUtilities.dp(14.66f) / 2.0f;
        rectF.set(f7, f10 - dp, this.d.l() + f7 + AndroidUtilities.dp(9.33f), dp + f10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        this.d.c(f7 + AndroidUtilities.dp(4.66f), f10, 1.0f, w02, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.d.l() + AndroidUtilities.dp(9.33f));
    }
}
