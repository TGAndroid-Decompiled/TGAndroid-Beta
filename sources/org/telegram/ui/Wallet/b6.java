package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class b6 extends FrameLayout {
    public final e6 f34336a;

    public b6(e6 e6Var, Context context) {
        super(context);
        this.f34336a = e6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        e6 e6Var = this.f34336a;
        e6Var.f34447j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (e6Var.f34447j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
