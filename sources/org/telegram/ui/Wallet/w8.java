package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class w8 extends FrameLayout {
    public final y8 f35483a;

    public w8(y8 y8Var, Context context) {
        super(context);
        this.f35483a = y8Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        y8 y8Var = this.f35483a;
        y8Var.f35557j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (y8Var.f35557j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
