package org.telegram.ui.Components;

import android.graphics.Canvas;

public final class j31 extends eh.s {
    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        lv0.a(canvas, getLayout());
        canvas.restore();
    }
}
