package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class l6 extends FrameLayout {
    public final o6 f42739a;

    public l6(o6 o6Var, Context context) {
        super(context);
        this.f42739a = o6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        o6 o6Var = this.f42739a;
        o6Var.f42914j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (o6Var.f42914j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
