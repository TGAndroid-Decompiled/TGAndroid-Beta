package org.telegram.ui;

import android.graphics.Canvas;
public final class g41 extends ng.c {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29347d6, false));
        }
        super.onDraw(canvas);
    }
}
