package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class o31 implements Runnable {
    public final int f31151a;
    public final f41 f31152b;

    public o31(f41 f41Var, int i10) {
        this.f31151a = i10;
        this.f31152b = f41Var;
    }

    @Override
    public final void run() {
        switch (this.f31151a) {
            case 0:
                f41 f41Var = this.f31152b;
                v31 v31Var = f41Var.G;
                v31Var.C1(true);
                t31 t31Var = f41Var.f28025s;
                t31Var.C1(true);
                f41Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(t31Var);
                AndroidUtilities.updateVisibleRows(v31Var);
                return;
            default:
                f41 f41Var2 = this.f31152b;
                if (f41Var2.l()) {
                    f41Var2.m();
                    return;
                }
                return;
        }
    }
}
