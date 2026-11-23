package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class c7 extends FrameLayout {
    public final f7 f44138a;

    public c7(f7 f7Var, Context context) {
        super(context);
        this.f44138a = f7Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        f7 f7Var = this.f44138a;
        f7Var.f44294j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (f7Var.f44294j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
