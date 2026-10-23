package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
public final class fq0 implements bh.k {
    public final int f26438a;
    public final mm0 f26439b;

    public fq0(mm0 mm0Var, int i10) {
        this.f26438a = i10;
        this.f26439b = mm0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f26438a) {
            case 0:
                return ((lq0) this.f26439b).drawChild(canvas, view, j10);
            default:
                return ((pu0) this.f26439b).drawChild(canvas, view, j10);
        }
    }
}
