package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
public final class tp0 implements ah.n {
    public final int f28512a;
    public final yl0 f28513b;

    public tp0(yl0 yl0Var, int i10) {
        this.f28512a = i10;
        this.f28513b = yl0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f28512a) {
            case 0:
                return ((yp0) this.f28513b).drawChild(canvas, view, j3);
            default:
                return ((du0) this.f28513b).drawChild(canvas, view, j3);
        }
    }
}
