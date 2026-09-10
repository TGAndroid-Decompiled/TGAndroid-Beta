package org.telegram.ui;

import android.graphics.Canvas;
public final class ha1 extends qa1 {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
        }
        super.onDraw(canvas);
    }
}
