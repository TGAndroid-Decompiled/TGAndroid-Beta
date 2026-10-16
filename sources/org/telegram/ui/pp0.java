package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class pp0 extends org.telegram.ui.Components.mm0 {
    public final int V2;
    public final yp0 W2;

    public pp0(yp0 yp0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.W2 = yp0Var;
        this.V2 = i10;
    }

    @Override
    public final Integer W0(int i10) {
        yp0 yp0Var = this.W2;
        if ((i10 >= yp0Var.f41864b0 && i10 < yp0Var.f41866c0) || (i10 >= yp0Var.f41867d0 && i10 < yp0Var.f41868e0)) {
            return 0;
        }
        return super.W0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        yp0 yp0Var = this.W2;
        if (yp0Var.G && yp0Var.E != null && yp0Var.F != null) {
            int save = canvas.save();
            canvas.translate(yp0Var.E.getLeft() + yp0Var.F.getLeft(), yp0Var.F.getTop());
            yp0Var.E.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        zh.f5 f5Var;
        super.onLayout(z10, i10, i11, i12, i13);
        yp0 yp0Var = this.W2;
        eq0 eq0Var = yp0Var.f41880p0;
        yp0Var.h();
        if (yp0Var.K != null) {
            if (yp0Var.J != null && yp0Var.c()) {
                yp0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.V2 == 1) {
            f5Var = eq0Var.f35351c;
        } else {
            f5Var = eq0Var.f35349b;
        }
        if (f5Var != null && yp0Var.c()) {
            f5Var.a();
        }
    }
}
