package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
public final class u31 extends nh.p {
    public final li.k U;
    public final x31 V;

    public u31(x31 x31Var, Context context) {
        super(context);
        this.V = x31Var;
        this.U = new li.k(23);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L = org.telegram.messenger.i0.L(8.0f) + this.V.d.getWidth();
        canvas.saveLayerAlpha(getScrollX(), 0.0f, (getWidth() + getScrollX()) - L, getHeight(), 255, 31);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        hv0.a(canvas, getLayout());
        canvas.restore();
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set((getWidth() - L) - org.telegram.messenger.i0.L(24.0f), 0.0f, getWidth() - L, getHeight());
        this.U.o(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
