package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class s21 implements Runnable {
    public final int f28123a;
    public final l31 f28124b;

    public s21(l31 l31Var, int i10) {
        this.f28123a = i10;
        this.f28124b = l31Var;
    }

    @Override
    public final void run() {
        switch (this.f28123a) {
            case 0:
                l31 l31Var = this.f28124b;
                b31 b31Var = l31Var.G;
                b31Var.w1(true);
                z21 z21Var = l31Var.f25952s;
                z21Var.w1(true);
                l31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(z21Var);
                AndroidUtilities.updateVisibleRows(b31Var);
                return;
            default:
                l31 l31Var2 = this.f28124b;
                if (l31Var2.k()) {
                    l31Var2.l();
                    return;
                }
                return;
        }
    }
}
