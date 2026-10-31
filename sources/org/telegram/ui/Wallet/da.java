package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class da extends FrameLayout {
    public final fa f34433a;

    public da(fa faVar, Context context) {
        super(context);
        this.f34433a = faVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        fa faVar = this.f34433a;
        faVar.f34518j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (faVar.f34518j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
