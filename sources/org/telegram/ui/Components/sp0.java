package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
public final class sp0 implements ah.m {
    public final int f28332a;
    public final xl0 f28333b;

    public sp0(xl0 xl0Var, int i10) {
        this.f28332a = i10;
        this.f28333b = xl0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f28332a) {
            case 0:
                return ((xp0) this.f28333b).drawChild(canvas, view, j3);
            default:
                return ((cu0) this.f28333b).drawChild(canvas, view, j3);
        }
    }
}
