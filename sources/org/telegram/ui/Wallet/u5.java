package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class u5 extends FrameLayout {
    public final x5 f35607a;

    public u5(x5 x5Var, Context context) {
        super(context);
        this.f35607a = x5Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        x5 x5Var = this.f35607a;
        x5Var.f35705j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (x5Var.f35705j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
