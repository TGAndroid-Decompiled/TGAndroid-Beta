package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class a10 extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.d6 f31950a;
    public final Paint f31951b;
    public final int f31952c;
    public final org.telegram.ui.Components.t01 d;

    public a10(String str, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        Paint paint = new Paint(1);
        this.f31951b = paint;
        this.f31950a = d6Var;
        this.f31952c = i10;
        this.d = new org.telegram.ui.Components.t01(str, 9.33f, AndroidUtilities.bold());
        paint.setStyle(Paint.Style.FILL);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int v02 = org.telegram.ui.ActionBar.h6.v0(this.f31952c, this.f31950a);
        int l1 = org.telegram.ui.ActionBar.h6.l1(0.15f, v02);
        Paint paint2 = this.f31951b;
        paint2.setColor(l1);
        float f10 = (i14 + i12) / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        float dp = AndroidUtilities.dp(14.66f) / 2.0f;
        rectF.set(f7, f10 - dp, this.d.l() + f7 + AndroidUtilities.dp(9.33f), dp + f10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        this.d.c(f7 + AndroidUtilities.dp(4.66f), f10, 1.0f, v02, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.d.l() + AndroidUtilities.dp(9.33f));
    }
}
