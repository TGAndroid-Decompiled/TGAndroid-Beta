package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class p6 extends FrameLayout {
    public final s6 f35038a;

    public p6(s6 s6Var, Context context) {
        super(context);
        this.f35038a = s6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        s6 s6Var = this.f35038a;
        s6Var.f35187j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (s6Var.f35187j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
