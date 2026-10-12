package org.telegram.ui;

import android.graphics.Canvas;
public final class ja1 extends sa1 {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
        }
        super.onDraw(canvas);
    }
}
