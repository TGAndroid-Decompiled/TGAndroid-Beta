package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class ms implements bh.k {
    public final int f39225a;
    public final org.telegram.ui.Components.im0 f39226b;

    public ms(org.telegram.ui.Components.im0 im0Var, int i10) {
        this.f39225a = i10;
        this.f39226b = im0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f39225a) {
            case 0:
            default:
                return this.f39226b.drawChild(canvas, view, j10);
        }
    }
}
