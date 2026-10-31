package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class en0 extends org.telegram.ui.Components.tk0 {
    public final int f37087e3;
    public final nn0 f37088f3;

    public en0(nn0 nn0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, p6Var);
        this.f37088f3 = nn0Var;
        this.f37087e3 = i10;
    }

    @Override
    public final Integer V0(int i10) {
        nn0 nn0Var = this.f37088f3;
        if ((i10 >= nn0Var.f39985b0 && i10 < nn0Var.f39987c0) || (i10 >= nn0Var.f39988d0 && i10 < nn0Var.f39989e0)) {
            return 0;
        }
        return super.V0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        nn0 nn0Var = this.f37088f3;
        if (nn0Var.G && nn0Var.E != null && nn0Var.F != null) {
            int save = canvas.save();
            canvas.translate(nn0Var.E.getLeft() + nn0Var.F.getLeft(), nn0Var.F.getTop());
            nn0Var.E.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        rh.v5 v5Var;
        super.onLayout(z10, i10, i11, i12, i13);
        nn0 nn0Var = this.f37088f3;
        tn0 tn0Var = nn0Var.f40001p0;
        nn0Var.h();
        if (nn0Var.K != null) {
            if (nn0Var.J != null && nn0Var.c()) {
                nn0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f37087e3 == 1) {
            v5Var = tn0Var.f41872c;
        } else {
            v5Var = tn0Var.f41870b;
        }
        if (v5Var != null && nn0Var.c()) {
            v5Var.b();
        }
    }
}
