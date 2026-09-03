package org.telegram.ui;

import android.graphics.Canvas;
public final class q91 extends org.telegram.ui.Cells.a8 {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
        }
        super.onDraw(canvas);
    }
}
