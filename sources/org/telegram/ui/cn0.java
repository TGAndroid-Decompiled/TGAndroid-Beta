package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class cn0 extends org.telegram.ui.Components.uk0 {
    public final int f36351e3;
    public final ln0 f36352f3;

    public cn0(ln0 ln0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, p6Var);
        this.f36352f3 = ln0Var;
        this.f36351e3 = i10;
    }

    @Override
    public final Integer V0(int i10) {
        ln0 ln0Var = this.f36352f3;
        if ((i10 >= ln0Var.f39318b0 && i10 < ln0Var.f39320c0) || (i10 >= ln0Var.f39321d0 && i10 < ln0Var.f39322e0)) {
            return 0;
        }
        return super.V0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ln0 ln0Var = this.f36352f3;
        if (ln0Var.G && ln0Var.E != null && ln0Var.F != null) {
            int save = canvas.save();
            canvas.translate(ln0Var.E.getLeft() + ln0Var.F.getLeft(), ln0Var.F.getTop());
            ln0Var.E.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        rh.v5 v5Var;
        super.onLayout(z10, i10, i11, i12, i13);
        ln0 ln0Var = this.f36352f3;
        rn0 rn0Var = ln0Var.f39334p0;
        ln0Var.h();
        if (ln0Var.K != null) {
            if (ln0Var.J != null && ln0Var.c()) {
                ln0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f36351e3 == 1) {
            v5Var = rn0Var.f41114c;
        } else {
            v5Var = rn0Var.f41112b;
        }
        if (v5Var != null && ln0Var.c()) {
            v5Var.b();
        }
    }
}
