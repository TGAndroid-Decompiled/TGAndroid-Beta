package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class b6 extends FrameLayout {
    public final e6 f34042a;

    public b6(e6 e6Var, Context context) {
        super(context);
        this.f34042a = e6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        e6 e6Var = this.f34042a;
        e6Var.f34159j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (e6Var.f34159j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
