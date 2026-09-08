package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class mp0 extends org.telegram.ui.Components.ll0 {
    public final int X2;
    public final vp0 Y2;

    public mp0(vp0 vp0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.Y2 = vp0Var;
        this.X2 = i10;
    }

    @Override
    public final Integer V0(int i10) {
        vp0 vp0Var = this.Y2;
        if ((i10 >= vp0Var.f41629b0 && i10 < vp0Var.f41631c0) || (i10 >= vp0Var.f41632d0 && i10 < vp0Var.f41634e0)) {
            return 0;
        }
        return super.V0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        vp0 vp0Var = this.Y2;
        if (vp0Var.G && vp0Var.E != null && vp0Var.F != null) {
            int save = canvas.save();
            canvas.translate(vp0Var.E.getLeft() + vp0Var.F.getLeft(), vp0Var.F.getTop());
            vp0Var.E.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        zh.j5 j5Var;
        super.onLayout(z10, i10, i11, i12, i13);
        vp0 vp0Var = this.Y2;
        bq0 bq0Var = vp0Var.f41646p0;
        vp0Var.h();
        if (vp0Var.K != null) {
            if (vp0Var.J != null && vp0Var.c()) {
                vp0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.X2 == 1) {
            j5Var = bq0Var.f34888c;
        } else {
            j5Var = bq0Var.f34886b;
        }
        if (j5Var != null && vp0Var.c()) {
            j5Var.a();
        }
    }
}
