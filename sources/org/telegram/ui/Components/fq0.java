package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
public final class fq0 implements bh.k {
    public final int f25106a;
    public final mm0 f25107b;

    public fq0(mm0 mm0Var, int i10) {
        this.f25106a = i10;
        this.f25107b = mm0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f25106a) {
            case 0:
                return ((lq0) this.f25107b).drawChild(canvas, view, j10);
            default:
                return ((pu0) this.f25107b).drawChild(canvas, view, j10);
        }
    }
}
