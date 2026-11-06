package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class z9 extends FrameLayout {
    public final ba f43476a;

    public z9(ba baVar, Context context) {
        super(context);
        this.f43476a = baVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        ba baVar = this.f43476a;
        baVar.f42188j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (baVar.f42188j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
