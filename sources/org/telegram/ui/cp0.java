package org.telegram.ui;

import android.graphics.Canvas;
public final class cp0 extends org.telegram.ui.Cells.ea {
    public static void b(cp0 cp0Var, Canvas canvas) {
        super.draw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (canvas.isHardwareAccelerated()) {
            super.draw(canvas);
        } else {
            lf.q0.a(canvas, this, new w3(this, 12));
        }
    }
}
