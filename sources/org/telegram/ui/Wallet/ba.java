package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class ba extends FrameLayout {
    public final da f43539a;

    public ba(da daVar, Context context) {
        super(context);
        this.f43539a = daVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        da daVar = this.f43539a;
        daVar.f43768j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (daVar.f43768j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
