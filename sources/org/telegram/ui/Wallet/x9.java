package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class x9 extends FrameLayout {
    public final z9 f43365a;

    public x9(z9 z9Var, Context context) {
        super(context);
        this.f43365a = z9Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        z9 z9Var = this.f43365a;
        z9Var.f43471j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (z9Var.f43471j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
