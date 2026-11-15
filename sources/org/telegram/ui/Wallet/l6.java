package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class l6 extends FrameLayout {
    public final o6 f44123a;

    public l6(o6 o6Var, Context context) {
        super(context);
        this.f44123a = o6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        o6 o6Var = this.f44123a;
        o6Var.f44255j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (o6Var.f44255j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
