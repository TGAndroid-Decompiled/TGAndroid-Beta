package org.telegram.ui.Wallet;

import android.view.View;
public final class e3 implements o1.g {
    public final int f34162a;
    public final k3 f34163b;

    public e3(k3 k3Var, int i10) {
        this.f34162a = i10;
        this.f34163b = k3Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f34162a) {
            case 0:
                k3 k3Var = this.f34163b;
                k3Var.C = f7;
                k3Var.f34385a.invalidate();
                return;
            case 1:
                k3 k3Var2 = this.f34163b;
                k3Var2.f34390c0 = f7;
                org.telegram.ui.Cells.x0 x0Var = k3Var2.f34385a;
                x0Var.invalidate();
                if (x0Var.getParent() instanceof View) {
                    ((View) x0Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                k3 k3Var3 = this.f34163b;
                k3Var3.f34386a0 = f7;
                org.telegram.ui.Cells.x0 x0Var2 = k3Var3.f34385a;
                x0Var2.invalidate();
                if (x0Var2.getParent() instanceof View) {
                    ((View) x0Var2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
