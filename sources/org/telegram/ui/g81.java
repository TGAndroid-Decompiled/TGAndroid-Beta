package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class g81 extends ReplacementSpan {

    public final org.telegram.ui.Components.pz0 f38337a = new org.telegram.ui.Components.pz0(LocaleController.getString(R.string.StakeDiceTitleBeta), 12.0f, AndroidUtilities.bold());

    public final Paint f38338b = new Paint(1);

    public final org.telegram.ui.ActionBar.c6 f38339c;

    public g81(org.telegram.ui.ActionBar.c6 c6Var) {
        this.f38339c = c6Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        float fDp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.0f);
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.f38339c);
        Paint paint2 = this.f38338b;
        paint2.setColor(iV0);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f10, fDp - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f) + f10 + this.f38337a.f31697c, AndroidUtilities.dp(9.0f) + fDp);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
        this.f38337a.c(f10 + AndroidUtilities.dp(8.0f), fDp, 1.0f, -1, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (AndroidUtilities.dp(16.0f) + this.f38337a.f31697c);
    }
}
