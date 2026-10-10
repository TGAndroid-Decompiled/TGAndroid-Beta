package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class t5 extends FrameLayout {
    public final w5 f35577a;

    public t5(w5 w5Var, Context context) {
        super(context);
        this.f35577a = w5Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        w5 w5Var = this.f35577a;
        w5Var.f35675j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (w5Var.f35675j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
