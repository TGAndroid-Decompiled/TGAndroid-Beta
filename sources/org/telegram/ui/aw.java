package org.telegram.ui;

import android.graphics.Canvas;
public final class aw extends org.telegram.ui.Components.f5 {
    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(org.telegram.messenger.g0.L(-2.0f), org.telegram.messenger.g0.L(1.0f));
        super.draw(canvas);
        canvas.restore();
    }
}
