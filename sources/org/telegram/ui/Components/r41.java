package org.telegram.ui.Components;

import android.graphics.Canvas;
public final class r41 extends vh.n {
    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        nw0.a(canvas, getLayout());
        canvas.restore();
    }
}
