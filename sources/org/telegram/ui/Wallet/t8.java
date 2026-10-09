package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class t8 extends FrameLayout {
    public final v8 f35488a;

    public t8(v8 v8Var, Context context) {
        super(context);
        this.f35488a = v8Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        v8 v8Var = this.f35488a;
        v8Var.f35567j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (v8Var.f35567j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
