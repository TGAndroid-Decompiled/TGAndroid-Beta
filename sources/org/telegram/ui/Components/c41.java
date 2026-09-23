package org.telegram.ui.Components;

import android.graphics.Canvas;
public final class c41 extends vh.o {
    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        bw0.a(canvas, getLayout());
        canvas.restore();
    }
}
