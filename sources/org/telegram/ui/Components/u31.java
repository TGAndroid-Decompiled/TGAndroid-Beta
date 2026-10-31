package org.telegram.ui.Components;

import android.graphics.Canvas;
public final class u31 extends nh.p {
    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        gv0.a(canvas, getLayout());
        canvas.restore();
    }
}
