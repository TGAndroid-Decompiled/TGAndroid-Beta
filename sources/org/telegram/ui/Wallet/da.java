package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class da extends FrameLayout {
    public final fa f34438a;

    public da(fa faVar, Context context) {
        super(context);
        this.f34438a = faVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        fa faVar = this.f34438a;
        faVar.f34516j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (faVar.f34516j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
