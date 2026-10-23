package org.telegram.ui.Components;

import android.graphics.Canvas;
public final class h51 extends wh.n {
    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        ax0.a(canvas, getLayout());
        canvas.restore();
    }
}
