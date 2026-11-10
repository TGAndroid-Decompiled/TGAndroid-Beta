package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class m6 extends FrameLayout {
    public final p6 f42827a;

    public m6(p6 p6Var, Context context) {
        super(context);
        this.f42827a = p6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        p6 p6Var = this.f42827a;
        p6Var.f42997j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (p6Var.f42997j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
