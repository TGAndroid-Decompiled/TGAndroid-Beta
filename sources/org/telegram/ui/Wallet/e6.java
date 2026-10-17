package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class e6 extends FrameLayout {
    public final h6 f34168a;

    public e6(h6 h6Var, Context context) {
        super(context);
        this.f34168a = h6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        h6 h6Var = this.f34168a;
        h6Var.f34273j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (h6Var.f34273j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
