package org.telegram.ui.Components;

import android.graphics.Canvas;
public final class n21 extends yh.l {
    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        du0.a(canvas, getLayout());
        canvas.restore();
    }
}
