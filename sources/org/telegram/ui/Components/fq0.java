package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
public final class fq0 implements bh.k {
    public final int f24802a;
    public final mm0 f24803b;

    public fq0(mm0 mm0Var, int i10) {
        this.f24802a = i10;
        this.f24803b = mm0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f24802a) {
            case 0:
                return ((kq0) this.f24803b).drawChild(canvas, view, j10);
            default:
                return ((pu0) this.f24803b).drawChild(canvas, view, j10);
        }
    }
}
