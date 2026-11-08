package org.telegram.ui;

import android.graphics.Canvas;
public final class e41 extends org.telegram.ui.Cells.w7 {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27852d6, false));
        }
        super.onDraw(canvas);
    }
}
