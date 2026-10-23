package org.telegram.ui;

import android.graphics.Canvas;
public final class ap0 extends org.telegram.ui.Cells.ga {
    @Override
    public final void draw(Canvas canvas) {
        if (canvas.isHardwareAccelerated()) {
            super.draw(canvas);
        } else {
            zf.j0.a(canvas, this, new u3(this, 15));
        }
    }
}
