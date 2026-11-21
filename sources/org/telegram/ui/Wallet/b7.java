package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class b7 extends FrameLayout {
    public final e7 f43995a;

    public b7(e7 e7Var, Context context) {
        super(context);
        this.f43995a = e7Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        e7 e7Var = this.f43995a;
        e7Var.f44161j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (e7Var.f44161j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
