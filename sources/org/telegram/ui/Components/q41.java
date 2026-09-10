package org.telegram.ui.Components;

import android.graphics.Canvas;
public final class q41 extends uh.o {
    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        mw0.a(canvas, getLayout());
        canvas.restore();
    }
}
