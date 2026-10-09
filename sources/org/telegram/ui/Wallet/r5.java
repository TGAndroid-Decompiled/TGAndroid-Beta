package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class r5 extends FrameLayout {
    public final u5 f35418a;

    public r5(u5 u5Var, Context context) {
        super(context);
        this.f35418a = u5Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        u5 u5Var = this.f35418a;
        u5Var.f35513j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (u5Var.f35513j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
