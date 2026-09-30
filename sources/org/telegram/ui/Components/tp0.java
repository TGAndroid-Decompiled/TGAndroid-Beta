package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
public final class tp0 implements ah.m {
    public final int f28605a;
    public final yl0 f28606b;

    public tp0(yl0 yl0Var, int i10) {
        this.f28605a = i10;
        this.f28606b = yl0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f28605a) {
            case 0:
                return ((yp0) this.f28606b).drawChild(canvas, view, j3);
            default:
                return ((du0) this.f28606b).drawChild(canvas, view, j3);
        }
    }
}
