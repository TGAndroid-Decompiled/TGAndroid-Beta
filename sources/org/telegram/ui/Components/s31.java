package org.telegram.ui.Components;

import android.graphics.Canvas;
public final class s31 extends gh.s {
    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        tv0.a(canvas, getLayout());
        canvas.restore();
    }
}
