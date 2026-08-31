package org.telegram.ui;

import android.graphics.Canvas;
public final class l91 extends yf.c {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
        }
        super.onDraw(canvas);
    }
}
