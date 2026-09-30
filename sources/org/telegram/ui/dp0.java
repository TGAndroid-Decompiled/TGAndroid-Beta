package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class dp0 extends org.telegram.ui.Components.zl0 {
    public final int f33251e3;
    public final mp0 f33252f3;

    public dp0(mp0 mp0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.f33252f3 = mp0Var;
        this.f33251e3 = i10;
    }

    @Override
    public final Integer X0(int i10) {
        mp0 mp0Var = this.f33252f3;
        if ((i10 >= mp0Var.f35735b0 && i10 < mp0Var.f35737c0) || (i10 >= mp0Var.f35738d0 && i10 < mp0Var.f35739e0)) {
            return 0;
        }
        return super.X0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        mp0 mp0Var = this.f33252f3;
        if (mp0Var.G && mp0Var.E != null && mp0Var.F != null) {
            int save = canvas.save();
            canvas.translate(mp0Var.E.getLeft() + mp0Var.F.getLeft(), mp0Var.F.getTop());
            mp0Var.E.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        yh.k5 k5Var;
        super.onLayout(z10, i10, i11, i12, i13);
        mp0 mp0Var = this.f33252f3;
        sp0 sp0Var = mp0Var.f35751p0;
        mp0Var.h();
        if (mp0Var.K != null) {
            if (mp0Var.J != null && mp0Var.c()) {
                mp0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f33251e3 == 1) {
            k5Var = sp0Var.f37939c;
        } else {
            k5Var = sp0Var.f37937b;
        }
        if (k5Var != null && mp0Var.c()) {
            k5Var.a();
        }
    }
}
