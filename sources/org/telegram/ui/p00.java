package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;

public final class p00 extends ReplacementSpan {

    public final org.telegram.ui.ActionBar.c6 f41233a;

    public final Paint f41234b;

    public final int f41235c;
    public final org.telegram.ui.Components.pz0 d;

    public p00(String str, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        Paint paint = new Paint(1);
        this.f41234b = paint;
        this.f41233a = c6Var;
        this.f41235c = i10;
        this.d = new org.telegram.ui.Components.pz0(str, 9.33f, AndroidUtilities.bold());
        paint.setStyle(Paint.Style.FILL);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        int iV0 = org.telegram.ui.ActionBar.g6.v0(this.f41235c, this.f41233a);
        int iL1 = org.telegram.ui.ActionBar.g6.l1(0.15f, iV0);
        Paint paint2 = this.f41234b;
        paint2.setColor(iL1);
        float f11 = (i14 + i12) / 2.0f;
        float fDp = AndroidUtilities.dp(14.66f);
        RectF rectF = AndroidUtilities.rectTmp;
        float f12 = fDp / 2.0f;
        rectF.set(f10, f11 - f12, this.d.l() + f10 + AndroidUtilities.dp(9.33f), f12 + f11);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        this.d.c(f10 + AndroidUtilities.dp(4.66f), f11, 1.0f, iV0, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.d.l() + AndroidUtilities.dp(9.33f));
    }
}
