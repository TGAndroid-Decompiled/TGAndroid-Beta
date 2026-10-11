package org.telegram.ui;

import android.graphics.Canvas;
public final class op0 extends org.telegram.ui.Cells.ga {
    @Override
    public final void draw(Canvas canvas) {
        if (canvas.isHardwareAccelerated()) {
            super.draw(canvas);
        } else {
            yf.i0.a(canvas, this, new s3(this, 15));
        }
    }
}
