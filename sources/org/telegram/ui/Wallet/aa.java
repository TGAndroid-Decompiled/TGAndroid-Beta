package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class aa extends FrameLayout {
    public final ca f42157a;

    public aa(ca caVar, Context context) {
        super(context);
        this.f42157a = caVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        ca caVar = this.f42157a;
        caVar.f42255j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (caVar.f42255j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
