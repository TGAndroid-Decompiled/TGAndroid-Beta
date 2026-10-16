package org.telegram.ui;

import android.graphics.Canvas;
public final class la1 extends lg.c {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
        }
        super.onDraw(canvas);
    }
}
