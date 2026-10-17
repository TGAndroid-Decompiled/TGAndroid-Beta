package org.telegram.ui.Components;

import android.graphics.Canvas;
public final class z41 extends wh.n {
    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        vw0.a(canvas, getLayout());
        canvas.restore();
    }
}
