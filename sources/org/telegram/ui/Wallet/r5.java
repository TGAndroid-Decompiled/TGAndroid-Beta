package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class r5 extends FrameLayout {
    public final u5 f33655a;

    public r5(u5 u5Var, Context context) {
        super(context);
        this.f33655a = u5Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        u5 u5Var = this.f33655a;
        u5Var.f33740j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (u5Var.f33740j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
