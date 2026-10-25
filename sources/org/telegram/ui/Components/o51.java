package org.telegram.ui.Components;

import android.graphics.Canvas;
public final class o51 extends xh.n {
    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        hx0.a(canvas, getLayout());
        canvas.restore();
    }
}
