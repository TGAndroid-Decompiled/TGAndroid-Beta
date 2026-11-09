package org.telegram.ui.Components;

import android.graphics.Canvas;
public final class t21 extends xh.l {
    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        gu0.a(canvas, getLayout());
        canvas.restore();
    }
}
