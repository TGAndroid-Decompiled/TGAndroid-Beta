package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class hp0 extends org.telegram.ui.Components.zl0 {
    public final int f37161e3;
    public final qp0 f37162f3;

    public hp0(qp0 qp0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.f37162f3 = qp0Var;
        this.f37161e3 = i10;
    }

    @Override
    public final Integer W0(int i10) {
        qp0 qp0Var = this.f37162f3;
        if ((i10 >= qp0Var.f39832b0 && i10 < qp0Var.f39834c0) || (i10 >= qp0Var.f39835d0 && i10 < qp0Var.f39837e0)) {
            return 0;
        }
        return super.W0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        qp0 qp0Var = this.f37162f3;
        if (qp0Var.G && qp0Var.E != null && qp0Var.F != null) {
            int save = canvas.save();
            canvas.translate(qp0Var.E.getLeft() + qp0Var.F.getLeft(), qp0Var.F.getTop());
            qp0Var.E.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        yh.l5 l5Var;
        super.onLayout(z10, i10, i11, i12, i13);
        qp0 qp0Var = this.f37162f3;
        wp0 wp0Var = qp0Var.f39849p0;
        qp0Var.h();
        if (qp0Var.K != null) {
            if (qp0Var.J != null && qp0Var.c()) {
                qp0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f37161e3 == 1) {
            l5Var = wp0Var.f42650c;
        } else {
            l5Var = wp0Var.f42648b;
        }
        if (l5Var != null && qp0Var.c()) {
            l5Var.a();
        }
    }
}
