package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class ms implements bh.k {
    public final int f39266a;
    public final org.telegram.ui.Components.im0 f39267b;

    public ms(org.telegram.ui.Components.im0 im0Var, int i10) {
        this.f39266a = i10;
        this.f39267b = im0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f39266a) {
            case 0:
            default:
                return this.f39267b.drawChild(canvas, view, j10);
        }
    }
}
