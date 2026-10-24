package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class d31 implements Runnable {
    public final int f25538a;
    public final v31 f25539b;

    public d31(v31 v31Var, int i10) {
        this.f25538a = i10;
        this.f25539b = v31Var;
    }

    @Override
    public final void run() {
        switch (this.f25538a) {
            case 0:
                v31 v31Var = this.f25539b;
                k31 k31Var = v31Var.G;
                k31Var.C1(true);
                i31 i31Var = v31Var.f31310s;
                i31Var.C1(true);
                v31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(i31Var);
                AndroidUtilities.updateVisibleRows(k31Var);
                return;
            default:
                v31 v31Var2 = this.f25539b;
                if (v31Var2.l()) {
                    v31Var2.m();
                    return;
                }
                return;
        }
    }
}
