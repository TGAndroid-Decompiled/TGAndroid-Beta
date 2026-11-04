package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
public final class m21 extends yh.l {
    public final k4.j V;
    public final p21 W;

    public m21(p21 p21Var, Context context) {
        super(context);
        this.W = p21Var;
        this.V = new k4.j(24);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(8.0f) + this.W.d.getWidth();
        canvas.saveLayerAlpha(getScrollX(), 0.0f, (getWidth() + getScrollX()) - L, getHeight(), 255, 31);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        du0.a(canvas, getLayout());
        canvas.restore();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - L) - org.telegram.messenger.g0.L(24.0f), 0.0f, getWidth() - L, getHeight());
        this.V.w(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
