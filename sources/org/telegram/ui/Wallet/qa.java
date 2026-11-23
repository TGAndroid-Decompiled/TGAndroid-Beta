package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class qa extends FrameLayout {
    public final sa f44973a;

    public qa(sa saVar, Context context) {
        super(context);
        this.f44973a = saVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        sa saVar = this.f44973a;
        saVar.f45124j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (saVar.f45124j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
