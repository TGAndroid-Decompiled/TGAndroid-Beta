package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class ns implements bh.k {
    public final int f39984a;
    public final org.telegram.ui.Components.mm0 f39985b;

    public ns(org.telegram.ui.Components.mm0 mm0Var, int i10) {
        this.f39984a = i10;
        this.f39985b = mm0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f39984a) {
            case 0:
            default:
                return this.f39985b.drawChild(canvas, view, j10);
        }
    }
}
