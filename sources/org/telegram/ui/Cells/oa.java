package org.telegram.ui.Cells;

import android.graphics.Canvas;
public final class oa extends org.telegram.ui.Components.n5 {
    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, org.telegram.messenger.g0.L(1.0f));
        super.draw(canvas);
        canvas.restore();
    }
}
