package org.telegram.ui;

import android.graphics.Canvas;
public final class e41 extends n41 {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29347d6, false));
        }
        super.onDraw(canvas);
    }
}
