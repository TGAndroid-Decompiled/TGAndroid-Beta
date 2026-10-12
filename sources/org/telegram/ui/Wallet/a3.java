package org.telegram.ui.Wallet;

import android.view.View;
public final class a3 implements o1.g {
    public final int f34462a;
    public final f3 f34463b;

    public a3(f3 f3Var, int i10) {
        this.f34462a = i10;
        this.f34463b = f3Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f34462a) {
            case 0:
                f3 f3Var = this.f34463b;
                f3Var.C = f7;
                f3Var.f34705a.invalidate();
                return;
            case 1:
                f3 f3Var2 = this.f34463b;
                f3Var2.f34710c0 = f7;
                org.telegram.ui.Cells.w0 w0Var = f3Var2.f34705a;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                f3 f3Var3 = this.f34463b;
                f3Var3.f34706a0 = f7;
                org.telegram.ui.Cells.w0 w0Var2 = f3Var3.f34705a;
                w0Var2.invalidate();
                if (w0Var2.getParent() instanceof View) {
                    ((View) w0Var2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
