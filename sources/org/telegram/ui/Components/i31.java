package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

public final class i31 extends eh.s {
    public final org.telegram.ui.v10 N;
    public final l31 O;

    public i31(l31 l31Var, Context context) {
        super(context);
        this.O = l31Var;
        this.N = new org.telegram.ui.v10();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int iDp = AndroidUtilities.dp(8.0f) + this.O.d.getWidth();
        canvas.saveLayerAlpha(getScrollX(), 0.0f, (getWidth() + getScrollX()) - iDp, getHeight(), 255, 31);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        lv0.a(canvas, getLayout());
        canvas.restore();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - iDp) - AndroidUtilities.dp(24.0f), 0.0f, getWidth() - iDp, getHeight());
        this.N.b(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
