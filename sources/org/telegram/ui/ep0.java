package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class ep0 extends org.telegram.ui.Components.nm0 {
    public final int f38921f3;
    public final np0 f38922g3;

    public ep0(np0 np0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.f38922g3 = np0Var;
        this.f38921f3 = i10;
    }

    @Override
    public final Integer W0(int i10) {
        np0 np0Var = this.f38922g3;
        if ((i10 >= np0Var.f41840b0 && i10 < np0Var.f41842c0) || (i10 >= np0Var.f41843d0 && i10 < np0Var.f41844e0)) {
            return 0;
        }
        return super.W0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        np0 np0Var = this.f38922g3;
        if (np0Var.G && np0Var.E != null && np0Var.F != null) {
            int save = canvas.save();
            canvas.translate(np0Var.E.getLeft() + np0Var.F.getLeft(), np0Var.F.getTop());
            np0Var.E.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        bi.t9 t9Var;
        super.onLayout(z10, i10, i11, i12, i13);
        np0 np0Var = this.f38922g3;
        tp0 tp0Var = np0Var.f41856p0;
        np0Var.h();
        if (np0Var.K != null) {
            if (np0Var.J != null && np0Var.c()) {
                np0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f38921f3 == 1) {
            t9Var = tp0Var.f43715c;
        } else {
            t9Var = tp0Var.f43713b;
        }
        if (t9Var != null && np0Var.c()) {
            t9Var.b();
        }
    }
}
