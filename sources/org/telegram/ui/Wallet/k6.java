package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class k6 extends FrameLayout {
    public final n6 f42710a;

    public k6(n6 n6Var, Context context) {
        super(context);
        this.f42710a = n6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        n6 n6Var = this.f42710a;
        n6Var.f42884j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (n6Var.f42884j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
