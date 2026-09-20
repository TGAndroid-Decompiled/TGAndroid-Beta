package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class s21 implements Runnable {
    public final int f28015a;
    public final l31 f28016b;

    public s21(l31 l31Var, int i10) {
        this.f28015a = i10;
        this.f28016b = l31Var;
    }

    @Override
    public final void run() {
        switch (this.f28015a) {
            case 0:
                l31 l31Var = this.f28016b;
                b31 b31Var = l31Var.G;
                b31Var.x1(true);
                z21 z21Var = l31Var.f26021s;
                z21Var.x1(true);
                l31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(z21Var);
                AndroidUtilities.updateVisibleRows(b31Var);
                return;
            default:
                l31 l31Var2 = this.f28016b;
                if (l31Var2.k()) {
                    l31Var2.l();
                    return;
                }
                return;
        }
    }
}
