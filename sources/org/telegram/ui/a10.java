package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class a10 extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.f6 f32429a;
    public final Paint f32430b;
    public final int f32431c;
    public final org.telegram.ui.Components.k01 d;

    public a10(String str, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint(1);
        this.f32430b = paint;
        this.f32429a = f6Var;
        this.f32431c = i10;
        this.d = new org.telegram.ui.Components.k01(str, 9.33f, AndroidUtilities.bold());
        paint.setStyle(Paint.Style.FILL);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        int v02 = org.telegram.ui.ActionBar.j6.v0(this.f32431c, this.f32429a);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.15f, v02);
        Paint paint2 = this.f32430b;
        paint2.setColor(l1);
        float f11 = (i14 + i12) / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        float dp = AndroidUtilities.dp(14.66f) / 2.0f;
        rectF.set(f10, f11 - dp, this.d.l() + f10 + AndroidUtilities.dp(9.33f), dp + f11);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        this.d.c(f10 + AndroidUtilities.dp(4.66f), f11, 1.0f, v02, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.d.l() + AndroidUtilities.dp(9.33f));
    }
}
