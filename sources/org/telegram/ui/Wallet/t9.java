package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class t9 extends FrameLayout {
    public final v9 f34973a;

    public t9(v9 v9Var, Context context) {
        super(context);
        this.f34973a = v9Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        v9 v9Var = this.f34973a;
        v9Var.f35035j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (v9Var.f35035j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
