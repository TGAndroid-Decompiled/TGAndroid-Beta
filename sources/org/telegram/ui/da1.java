package org.telegram.ui;

import android.graphics.Canvas;
public final class da1 extends kg.c {
    @Override
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18834d6, false));
        }
        super.onDraw(canvas);
    }
}
