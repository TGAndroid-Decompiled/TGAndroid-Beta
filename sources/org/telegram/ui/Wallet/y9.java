package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class y9 extends FrameLayout {
    public final aa f43484a;

    public y9(aa aaVar, Context context) {
        super(context);
        this.f43484a = aaVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        aa aaVar = this.f43484a;
        aaVar.f42198j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (aaVar.f42198j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
