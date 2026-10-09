package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class u8 extends FrameLayout {
    public final w8 f35547a;

    public u8(w8 w8Var, Context context) {
        super(context);
        this.f35547a = w8Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        w8 w8Var = this.f35547a;
        w8Var.f35629j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (w8Var.f35629j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
