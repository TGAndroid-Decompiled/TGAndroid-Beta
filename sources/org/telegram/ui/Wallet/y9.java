package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class y9 extends FrameLayout {
    public final aa f35160a;

    public y9(aa aaVar, Context context) {
        super(context);
        this.f35160a = aaVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        aa aaVar = this.f35160a;
        aaVar.f33998j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (aaVar.f33998j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
