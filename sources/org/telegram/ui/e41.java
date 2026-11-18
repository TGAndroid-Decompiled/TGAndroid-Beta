package org.telegram.ui;

import android.graphics.Canvas;
public final class e41 extends n41 {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29396d6, false));
        }
        super.onDraw(canvas);
    }
}
