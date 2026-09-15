package org.telegram.ui;

import android.graphics.Canvas;
public final class pp0 extends org.telegram.ui.Cells.ja {
    public static void b(pp0 pp0Var, Canvas canvas) {
        super.draw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (canvas.isHardwareAccelerated()) {
            super.draw(canvas);
        } else {
            yf.j0.a(canvas, this, new s3(this, 12));
        }
    }
}
