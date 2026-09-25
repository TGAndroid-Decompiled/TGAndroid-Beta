package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class r21 implements Runnable {
    public final int f27834a;
    public final k31 f27835b;

    public r21(k31 k31Var, int i10) {
        this.f27834a = i10;
        this.f27835b = k31Var;
    }

    @Override
    public final void run() {
        switch (this.f27834a) {
            case 0:
                k31 k31Var = this.f27835b;
                a31 a31Var = k31Var.G;
                a31Var.w1(true);
                y21 y21Var = k31Var.f25644s;
                y21Var.w1(true);
                k31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(y21Var);
                AndroidUtilities.updateVisibleRows(a31Var);
                return;
            default:
                k31 k31Var2 = this.f27835b;
                if (k31Var2.k()) {
                    k31Var2.l();
                    return;
                }
                return;
        }
    }
}
