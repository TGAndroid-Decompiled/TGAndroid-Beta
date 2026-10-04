package org.telegram.ui.Components;

import android.graphics.Canvas;
public final class b51 extends vh.n {
    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        xw0.a(canvas, getLayout());
        canvas.restore();
    }
}
