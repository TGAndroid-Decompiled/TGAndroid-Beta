package org.telegram.ui.Components;

import android.graphics.Canvas;
public final class d41 extends jh.s {
    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        cw0.a(canvas, getLayout());
        canvas.restore();
    }
}
