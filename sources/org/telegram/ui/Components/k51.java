package org.telegram.ui.Components;

import android.graphics.Canvas;
public final class k51 extends vh.n {
    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        fx0.a(canvas, getLayout());
        canvas.restore();
    }
}
