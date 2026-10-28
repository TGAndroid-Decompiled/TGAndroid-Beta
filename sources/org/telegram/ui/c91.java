package org.telegram.ui;

import android.graphics.Canvas;
public final class c91 extends mg.c {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23357d6, false));
        }
        super.onDraw(canvas);
    }
}
