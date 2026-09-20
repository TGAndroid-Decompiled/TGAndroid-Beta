package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class np0 extends org.telegram.ui.Components.vl0 {
    public final int X2;
    public final wp0 Y2;

    public np0(wp0 wp0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.Y2 = wp0Var;
        this.X2 = i10;
    }

    @Override
    public final Integer X0(int i10) {
        wp0 wp0Var = this.Y2;
        if ((i10 >= wp0Var.f39195b0 && i10 < wp0Var.f39197c0) || (i10 >= wp0Var.f39198d0 && i10 < wp0Var.f39199e0)) {
            return 0;
        }
        return super.X0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        wp0 wp0Var = this.Y2;
        if (wp0Var.G && wp0Var.E != null && wp0Var.F != null) {
            int save = canvas.save();
            canvas.translate(wp0Var.E.getLeft() + wp0Var.F.getLeft(), wp0Var.F.getTop());
            wp0Var.E.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        yh.l5 l5Var;
        super.onLayout(z10, i10, i11, i12, i13);
        wp0 wp0Var = this.Y2;
        cq0 cq0Var = wp0Var.f39211p0;
        wp0Var.h();
        if (wp0Var.K != null) {
            if (wp0Var.J != null && wp0Var.c()) {
                wp0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.X2 == 1) {
            l5Var = cq0Var.f32812c;
        } else {
            l5Var = cq0Var.f32810b;
        }
        if (l5Var != null && wp0Var.c()) {
            l5Var.a();
        }
    }
}
