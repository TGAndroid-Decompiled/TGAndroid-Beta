package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class j6 extends FrameLayout {
    public final m6 f42705a;

    public j6(m6 m6Var, Context context) {
        super(context);
        this.f42705a = m6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        m6 m6Var = this.f42705a;
        m6Var.f42851j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (m6Var.f42851j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
