package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class pa extends FrameLayout {
    public final ra f44841a;

    public pa(ra raVar, Context context) {
        super(context);
        this.f44841a = raVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        ra raVar = this.f44841a;
        raVar.f44992j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (raVar.f44992j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
