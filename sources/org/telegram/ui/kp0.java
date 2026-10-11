package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class kp0 extends org.telegram.ui.Components.rm0 {
    public final int V2;
    public final tp0 W2;

    public kp0(tp0 tp0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.W2 = tp0Var;
        this.V2 = i10;
    }

    @Override
    public final Integer W0(int i10) {
        tp0 tp0Var = this.W2;
        if ((i10 >= tp0Var.f42258b0 && i10 < tp0Var.f42260c0) || (i10 >= tp0Var.f42261d0 && i10 < tp0Var.f42263e0)) {
            return 0;
        }
        return super.W0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        tp0 tp0Var = this.W2;
        if (tp0Var.G && tp0Var.E != null && tp0Var.F != null) {
            int save = canvas.save();
            canvas.translate(tp0Var.E.getLeft() + tp0Var.F.getLeft(), tp0Var.F.getTop());
            tp0Var.E.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        yh.f5 f5Var;
        super.onLayout(z10, i10, i11, i12, i13);
        tp0 tp0Var = this.W2;
        zp0 zp0Var = tp0Var.f42275p0;
        tp0Var.h();
        if (tp0Var.K != null) {
            if (tp0Var.J != null && tp0Var.c()) {
                tp0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.V2 == 1) {
            f5Var = zp0Var.f45074c;
        } else {
            f5Var = zp0Var.f45072b;
        }
        if (f5Var != null && tp0Var.c()) {
            f5Var.a();
        }
    }
}
