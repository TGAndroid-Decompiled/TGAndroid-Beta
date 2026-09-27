package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class de extends org.telegram.ui.Components.t61 {
    @Override
    public final void m(Canvas canvas, View view, long j3) {
        if (view instanceof org.telegram.ui.Components.i61) {
            return;
        }
        drawChild(canvas, view, j3);
    }
}
