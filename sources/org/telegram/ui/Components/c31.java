package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class c31 implements Runnable {
    public final int f25183a;
    public final v31 f25184b;

    public c31(v31 v31Var, int i10) {
        this.f25183a = i10;
        this.f25184b = v31Var;
    }

    @Override
    public final void run() {
        switch (this.f25183a) {
            case 0:
                v31 v31Var = this.f25184b;
                l31 l31Var = v31Var.G;
                l31Var.y1(true);
                j31 j31Var = v31Var.f31555s;
                j31Var.y1(true);
                v31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(j31Var);
                AndroidUtilities.updateVisibleRows(l31Var);
                return;
            default:
                v31 v31Var2 = this.f25184b;
                if (v31Var2.k()) {
                    v31Var2.l();
                    return;
                }
                return;
        }
    }
}
