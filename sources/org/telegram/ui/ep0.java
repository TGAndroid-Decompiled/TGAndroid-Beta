package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class ep0 extends org.telegram.ui.Components.wl0 {
    public final int X2;
    public final np0 Y2;

    public ep0(np0 np0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.Y2 = np0Var;
        this.X2 = i10;
    }

    @Override
    public final Integer W0(int i10) {
        np0 np0Var = this.Y2;
        if ((i10 >= np0Var.f35940b0 && i10 < np0Var.f35942c0) || (i10 >= np0Var.f35943d0 && i10 < np0Var.f35944e0)) {
            return 0;
        }
        return super.W0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        np0 np0Var = this.Y2;
        if (np0Var.G && np0Var.E != null && np0Var.F != null) {
            int save = canvas.save();
            canvas.translate(np0Var.E.getLeft() + np0Var.F.getLeft(), np0Var.F.getTop());
            np0Var.E.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        yh.k5 k5Var;
        super.onLayout(z10, i10, i11, i12, i13);
        np0 np0Var = this.Y2;
        tp0 tp0Var = np0Var.f35956p0;
        np0Var.h();
        if (np0Var.K != null) {
            if (np0Var.J != null && np0Var.c()) {
                np0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.X2 == 1) {
            k5Var = tp0Var.f38169c;
        } else {
            k5Var = tp0Var.f38167b;
        }
        if (k5Var != null && np0Var.c()) {
            k5Var.a();
        }
    }
}
