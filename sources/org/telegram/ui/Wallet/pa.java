package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class pa extends FrameLayout {
    public final ra f44845a;

    public pa(ra raVar, Context context) {
        super(context);
        this.f44845a = raVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        ra raVar = this.f44845a;
        raVar.f44996j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (raVar.f44996j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
