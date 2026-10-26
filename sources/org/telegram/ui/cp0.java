package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class cp0 extends org.telegram.ui.Components.mm0 {
    public final int f38509f3;
    public final lp0 f38510g3;

    public cp0(lp0 lp0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.f38510g3 = lp0Var;
        this.f38509f3 = i10;
    }

    @Override
    public final Integer W0(int i10) {
        lp0 lp0Var = this.f38510g3;
        if ((i10 >= lp0Var.f41317b0 && i10 < lp0Var.f41319c0) || (i10 >= lp0Var.f41320d0 && i10 < lp0Var.f41321e0)) {
            return 0;
        }
        return super.W0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        lp0 lp0Var = this.f38510g3;
        if (lp0Var.G && lp0Var.E != null && lp0Var.F != null) {
            int save = canvas.save();
            canvas.translate(lp0Var.E.getLeft() + lp0Var.F.getLeft(), lp0Var.F.getTop());
            lp0Var.E.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        bi.t9 t9Var;
        super.onLayout(z10, i10, i11, i12, i13);
        lp0 lp0Var = this.f38510g3;
        rp0 rp0Var = lp0Var.f41333p0;
        lp0Var.h();
        if (lp0Var.K != null) {
            if (lp0Var.J != null && lp0Var.c()) {
                lp0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f38509f3 == 1) {
            t9Var = rp0Var.f43229c;
        } else {
            t9Var = rp0Var.f43227b;
        }
        if (t9Var != null && lp0Var.c()) {
            t9Var.b();
        }
    }
}
