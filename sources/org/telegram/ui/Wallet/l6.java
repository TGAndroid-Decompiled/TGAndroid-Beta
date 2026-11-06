package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class l6 extends FrameLayout {
    public final o6 f42740a;

    public l6(o6 o6Var, Context context) {
        super(context);
        this.f42740a = o6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        o6 o6Var = this.f42740a;
        o6Var.f42915j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (o6Var.f42915j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
