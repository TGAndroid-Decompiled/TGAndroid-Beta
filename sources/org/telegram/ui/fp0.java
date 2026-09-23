package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class fp0 extends org.telegram.ui.Components.ml0 {
    public final int X2;
    public final op0 Y2;

    public fp0(op0 op0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.Y2 = op0Var;
        this.X2 = i10;
    }

    @Override
    public final Integer W0(int i10) {
        op0 op0Var = this.Y2;
        if ((i10 >= op0Var.f35922b0 && i10 < op0Var.f35924c0) || (i10 >= op0Var.f35925d0 && i10 < op0Var.f35926e0)) {
            return 0;
        }
        return super.W0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        op0 op0Var = this.Y2;
        if (op0Var.G && op0Var.E != null && op0Var.F != null) {
            int save = canvas.save();
            canvas.translate(op0Var.E.getLeft() + op0Var.F.getLeft(), op0Var.F.getTop());
            op0Var.E.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        yh.l5 l5Var;
        super.onLayout(z10, i10, i11, i12, i13);
        op0 op0Var = this.Y2;
        up0 up0Var = op0Var.f35938p0;
        op0Var.h();
        if (op0Var.K != null) {
            if (op0Var.J != null && op0Var.c()) {
                op0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.X2 == 1) {
            l5Var = up0Var.f38147c;
        } else {
            l5Var = up0Var.f38145b;
        }
        if (l5Var != null && op0Var.c()) {
            l5Var.a();
        }
    }
}
