package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class bt implements bh.k {
    public final int f34383a;
    public final org.telegram.ui.Components.mm0 f34384b;

    public bt(org.telegram.ui.Components.mm0 mm0Var, int i10) {
        this.f34383a = i10;
        this.f34384b = mm0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f34383a) {
            case 0:
            default:
                return this.f34384b.drawChild(canvas, view, j10);
        }
    }
}
