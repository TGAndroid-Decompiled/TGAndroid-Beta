package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class m00 extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.b6 f40273a;
    public final Paint f40274b;
    public final int f40275c;
    public final org.telegram.ui.Components.nz0 d;

    public m00(String str, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        Paint paint = new Paint(1);
        this.f40274b = paint;
        this.f40273a = b6Var;
        this.f40275c = i9;
        this.d = new org.telegram.ui.Components.nz0(str, 9.33f, AndroidUtilities.bold());
        paint.setStyle(Paint.Style.FILL);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int v02 = org.telegram.ui.ActionBar.f6.v0(this.f40275c, this.f40273a);
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.15f, v02);
        Paint paint2 = this.f40274b;
        paint2.setColor(l1);
        float f11 = (i13 + i11) / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        float dp = AndroidUtilities.dp(14.66f) / 2.0f;
        rectF.set(f10, f11 - dp, this.d.l() + f10 + AndroidUtilities.dp(9.33f), dp + f11);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        this.d.c(f10 + AndroidUtilities.dp(4.66f), f11, 1.0f, v02, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.d.l() + AndroidUtilities.dp(9.33f));
    }
}
