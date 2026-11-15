package org.telegram.ui.Components;

import android.graphics.Canvas;
public final class x21 extends xh.l {
    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        fu0.a(canvas, getLayout());
        canvas.restore();
    }
}
