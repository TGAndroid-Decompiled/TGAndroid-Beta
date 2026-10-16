package org.telegram.ui;

import android.graphics.Canvas;
public final class ka1 extends org.telegram.ui.Cells.c8 {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
        }
        super.onDraw(canvas);
    }
}
