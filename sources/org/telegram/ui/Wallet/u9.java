package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class u9 extends FrameLayout {
    public final w9 f35306a;

    public u9(w9 w9Var, Context context) {
        super(context);
        this.f35306a = w9Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        w9 w9Var = this.f35306a;
        w9Var.f35367j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (w9Var.f35367j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
