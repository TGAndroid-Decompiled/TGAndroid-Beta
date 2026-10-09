package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class lp0 extends org.telegram.ui.Components.qm0 {
    public final int V2;
    public final up0 W2;

    public lp0(up0 up0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, e6Var);
        this.W2 = up0Var;
        this.V2 = i10;
    }

    @Override
    public final Integer W0(int i10) {
        up0 up0Var = this.W2;
        if ((i10 >= up0Var.f42513b0 && i10 < up0Var.f42515c0) || (i10 >= up0Var.f42516d0 && i10 < up0Var.f42518e0)) {
            return 0;
        }
        return super.W0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        up0 up0Var = this.W2;
        if (up0Var.G && up0Var.E != null && up0Var.F != null) {
            int save = canvas.save();
            canvas.translate(up0Var.E.getLeft() + up0Var.F.getLeft(), up0Var.F.getTop());
            up0Var.E.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        yh.e5 e5Var;
        super.onLayout(z10, i10, i11, i12, i13);
        up0 up0Var = this.W2;
        aq0 aq0Var = up0Var.f42530p0;
        up0Var.h();
        if (up0Var.K != null) {
            if (up0Var.J != null && up0Var.c()) {
                up0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.V2 == 1) {
            e5Var = aq0Var.f35981c;
        } else {
            e5Var = aq0Var.f35979b;
        }
        if (e5Var != null && up0Var.c()) {
            e5Var.a();
        }
    }
}
