package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class v9 extends FrameLayout {
    public final x9 f35020a;

    public v9(x9 x9Var, Context context) {
        super(context);
        this.f35020a = x9Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        x9 x9Var = this.f35020a;
        x9Var.f35145j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (x9Var.f35145j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
