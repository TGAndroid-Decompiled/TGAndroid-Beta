package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class v8 extends FrameLayout {
    public final x8 f35643a;

    public v8(x8 x8Var, Context context) {
        super(context);
        this.f35643a = x8Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        x8 x8Var = this.f35643a;
        x8Var.f35717j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (x8Var.f35717j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
