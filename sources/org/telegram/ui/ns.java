package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class ns implements bh.k {
    public final int f39974a;
    public final org.telegram.ui.Components.lm0 f39975b;

    public ns(org.telegram.ui.Components.lm0 lm0Var, int i10) {
        this.f39974a = i10;
        this.f39975b = lm0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f39974a) {
            case 0:
            default:
                return this.f39975b.drawChild(canvas, view, j10);
        }
    }
}
