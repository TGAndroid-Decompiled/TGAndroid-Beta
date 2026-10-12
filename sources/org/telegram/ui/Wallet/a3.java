package org.telegram.ui.Wallet;

import android.view.View;
public final class a3 implements o1.g {
    public final int f34464a;
    public final f3 f34465b;

    public a3(f3 f3Var, int i10) {
        this.f34464a = i10;
        this.f34465b = f3Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f34464a) {
            case 0:
                f3 f3Var = this.f34465b;
                f3Var.C = f7;
                f3Var.f34707a.invalidate();
                return;
            case 1:
                f3 f3Var2 = this.f34465b;
                f3Var2.f34712c0 = f7;
                org.telegram.ui.Cells.w0 w0Var = f3Var2.f34707a;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                f3 f3Var3 = this.f34465b;
                f3Var3.f34708a0 = f7;
                org.telegram.ui.Cells.w0 w0Var2 = f3Var3.f34707a;
                w0Var2.invalidate();
                if (w0Var2.getParent() instanceof View) {
                    ((View) w0Var2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
