package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class h6 extends FrameLayout {
    public final k6 f34303a;

    public h6(k6 k6Var, Context context) {
        super(context);
        this.f34303a = k6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        k6 k6Var = this.f34303a;
        k6Var.f34400j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (k6Var.f34400j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
