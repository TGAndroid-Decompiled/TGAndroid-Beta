package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class u21 implements Runnable {
    public final int f28595a;
    public final n31 f28596b;

    public u21(n31 n31Var, int i10) {
        this.f28595a = i10;
        this.f28596b = n31Var;
    }

    @Override
    public final void run() {
        switch (this.f28595a) {
            case 0:
                n31 n31Var = this.f28596b;
                d31 d31Var = n31Var.G;
                d31Var.x1(true);
                b31 b31Var = n31Var.f26619s;
                b31Var.x1(true);
                n31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(b31Var);
                AndroidUtilities.updateVisibleRows(d31Var);
                return;
            default:
                n31 n31Var2 = this.f28596b;
                if (n31Var2.k()) {
                    n31Var2.l();
                    return;
                }
                return;
        }
    }
}
