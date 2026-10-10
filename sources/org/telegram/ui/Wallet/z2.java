package org.telegram.ui.Wallet;

import android.view.View;
public final class z2 implements o1.g {
    public final int f35790a;
    public final e3 f35791b;

    public z2(e3 e3Var, int i10) {
        this.f35790a = i10;
        this.f35791b = e3Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f35790a) {
            case 0:
                e3 e3Var = this.f35791b;
                e3Var.C = f7;
                e3Var.f34864a.invalidate();
                return;
            case 1:
                e3 e3Var2 = this.f35791b;
                e3Var2.f34869c0 = f7;
                org.telegram.ui.Cells.w0 w0Var = e3Var2.f34864a;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                e3 e3Var3 = this.f35791b;
                e3Var3.f34865a0 = f7;
                org.telegram.ui.Cells.w0 w0Var2 = e3Var3.f34864a;
                w0Var2.invalidate();
                if (w0Var2.getParent() instanceof View) {
                    ((View) w0Var2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
