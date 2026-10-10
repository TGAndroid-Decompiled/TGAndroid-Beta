package org.telegram.ui;

import android.graphics.Canvas;
public final class da1 extends ma1 {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false));
        }
        super.onDraw(canvas);
    }
}
