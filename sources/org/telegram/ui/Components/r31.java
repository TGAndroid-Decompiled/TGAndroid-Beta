package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class r31 extends gh.s {
    public final org.telegram.ui.u10 N;
    public final u31 O;

    public r31(u31 u31Var, Context context) {
        super(context);
        this.O = u31Var;
        this.N = new org.telegram.ui.u10();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(8.0f) + this.O.d.getWidth();
        canvas.saveLayerAlpha(getScrollX(), 0.0f, (getWidth() + getScrollX()) - dp, getHeight(), 255, 31);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        tv0.a(canvas, getLayout());
        canvas.restore();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dp) - AndroidUtilities.dp(24.0f), 0.0f, getWidth() - dp, getHeight());
        this.N.b(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
