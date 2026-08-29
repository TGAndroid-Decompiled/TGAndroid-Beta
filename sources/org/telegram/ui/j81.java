package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j81 extends ReplacementSpan {
    public final org.telegram.ui.Components.zz0 f39470a = new org.telegram.ui.Components.zz0(LocaleController.getString(R.string.StakeDiceTitleBeta), 12.0f, AndroidUtilities.bold());
    public final Paint f39471b = new Paint(1);
    public final org.telegram.ui.ActionBar.c6 f39472c;

    public j81(org.telegram.ui.ActionBar.c6 c6Var) {
        this.f39472c = c6Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f9, int i12, int i13, int i14, Paint paint) {
        float dp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.0f);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.f39472c);
        Paint paint2 = this.f39471b;
        paint2.setColor(v02);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f9, dp - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f) + f9 + this.f39470a.f35462c, AndroidUtilities.dp(9.0f) + dp);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
        this.f39470a.c(f9 + AndroidUtilities.dp(8.0f), dp, 1.0f, -1, canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (AndroidUtilities.dp(16.0f) + this.f39470a.f35462c);
    }
}
