package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class b7 extends FrameLayout {
    public final e7 f43971a;

    public b7(e7 e7Var, Context context) {
        super(context);
        this.f43971a = e7Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        e7 e7Var = this.f43971a;
        e7Var.f44131j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (e7Var.f44131j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
