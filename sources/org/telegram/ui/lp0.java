package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class lp0 extends org.telegram.ui.Components.vl0 {
    public final int X2;
    public final up0 Y2;

    public lp0(up0 up0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.Y2 = up0Var;
        this.X2 = i10;
    }

    @Override
    public final Integer V0(int i10) {
        up0 up0Var = this.Y2;
        if ((i10 >= up0Var.f37308b0 && i10 < up0Var.f37310c0) || (i10 >= up0Var.f37311d0 && i10 < up0Var.f37312e0)) {
            return 0;
        }
        return super.V0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        up0 up0Var = this.Y2;
        if (up0Var.G && up0Var.E != null && up0Var.F != null) {
            int save = canvas.save();
            canvas.translate(up0Var.E.getLeft() + up0Var.F.getLeft(), up0Var.F.getTop());
            up0Var.E.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        xh.n5 n5Var;
        super.onLayout(z10, i10, i11, i12, i13);
        up0 up0Var = this.Y2;
        bq0 bq0Var = up0Var.f37324p0;
        up0Var.h();
        if (up0Var.K != null) {
            if (up0Var.J != null && up0Var.c()) {
                up0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.X2 == 1) {
            n5Var = bq0Var.f31341c;
        } else {
            n5Var = bq0Var.f31339b;
        }
        if (n5Var != null && up0Var.c()) {
            n5Var.a();
        }
    }
}
