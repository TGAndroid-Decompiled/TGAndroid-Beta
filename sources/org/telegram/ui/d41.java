package org.telegram.ui;

import android.graphics.Canvas;
public final class d41 extends ng.c {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false));
        }
        super.onDraw(canvas);
    }
}
