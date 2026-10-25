package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class a6 extends FrameLayout {
    public final d6 f36364a;

    public a6(d6 d6Var, Context context) {
        super(context);
        this.f36364a = d6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        d6 d6Var = this.f36364a;
        d6Var.f36467j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (d6Var.f36467j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
