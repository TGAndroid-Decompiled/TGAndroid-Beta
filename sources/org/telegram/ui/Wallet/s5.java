package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class s5 extends FrameLayout {
    public final v5 f33429a;

    public s5(v5 v5Var, Context context) {
        super(context);
        this.f33429a = v5Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        v5 v5Var = this.f33429a;
        v5Var.f33512j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (v5Var.f33512j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
