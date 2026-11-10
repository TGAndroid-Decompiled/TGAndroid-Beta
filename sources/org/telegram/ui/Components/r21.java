package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
public final class r21 extends xh.l {
    public final h6.m U;
    public final u21 V;

    public r21(u21 u21Var, Context context) {
        super(context);
        this.V = u21Var;
        this.U = new h6.m(28);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(8.0f) + this.V.d.getWidth();
        canvas.saveLayerAlpha(getScrollX(), 0.0f, (getWidth() + getScrollX()) - L, getHeight(), 255, 31);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        fu0.a(canvas, getLayout());
        canvas.restore();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - L) - org.telegram.messenger.g0.L(24.0f), 0.0f, getWidth() - L, getHeight());
        this.U.m(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
