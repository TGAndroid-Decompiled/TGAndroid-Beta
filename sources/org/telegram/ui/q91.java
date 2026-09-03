package org.telegram.ui;

import android.graphics.Canvas;
public final class q91 extends z91 {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
        }
        super.onDraw(canvas);
    }
}
