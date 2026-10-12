package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class np0 extends org.telegram.ui.Components.wm0 {
    public final int V2;
    public final wp0 W2;

    public np0(wp0 wp0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.W2 = wp0Var;
        this.V2 = i10;
    }

    @Override
    public final Integer W0(int i10) {
        wp0 wp0Var = this.W2;
        if ((i10 >= wp0Var.f43585b0 && i10 < wp0Var.f43587c0) || (i10 >= wp0Var.f43588d0 && i10 < wp0Var.f43590e0)) {
            return 0;
        }
        return super.W0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        wp0 wp0Var = this.W2;
        if (wp0Var.G && wp0Var.E != null && wp0Var.F != null) {
            int save = canvas.save();
            canvas.translate(wp0Var.E.getLeft() + wp0Var.F.getLeft(), wp0Var.F.getTop());
            wp0Var.E.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        yh.f5 f5Var;
        super.onLayout(z10, i10, i11, i12, i13);
        wp0 wp0Var = this.W2;
        cq0 cq0Var = wp0Var.f43602p0;
        wp0Var.h();
        if (wp0Var.K != null) {
            if (wp0Var.J != null && wp0Var.c()) {
                wp0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.V2 == 1) {
            f5Var = cq0Var.f36480c;
        } else {
            f5Var = cq0Var.f36478b;
        }
        if (f5Var != null && wp0Var.c()) {
            f5Var.a();
        }
    }
}
