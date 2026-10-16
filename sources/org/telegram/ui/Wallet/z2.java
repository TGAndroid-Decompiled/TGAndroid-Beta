package org.telegram.ui.Wallet;

import android.view.View;
public final class z2 implements o1.g {
    public final int f33652a;
    public final e3 f33653b;

    public z2(e3 e3Var, int i10) {
        this.f33652a = i10;
        this.f33653b = e3Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f33652a) {
            case 0:
                e3 e3Var = this.f33653b;
                e3Var.C = f7;
                e3Var.f32822a.invalidate();
                return;
            case 1:
                e3 e3Var2 = this.f33653b;
                e3Var2.f32827c0 = f7;
                org.telegram.ui.Cells.w0 w0Var = e3Var2.f32822a;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                e3 e3Var3 = this.f33653b;
                e3Var3.f32823a0 = f7;
                org.telegram.ui.Cells.w0 w0Var2 = e3Var3.f32822a;
                w0Var2.invalidate();
                if (w0Var2.getParent() instanceof View) {
                    ((View) w0Var2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
