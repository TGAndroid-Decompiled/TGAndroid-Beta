package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class u21 implements Runnable {
    public final int f28723a;
    public final n31 f28724b;

    public u21(n31 n31Var, int i10) {
        this.f28723a = i10;
        this.f28724b = n31Var;
    }

    @Override
    public final void run() {
        switch (this.f28723a) {
            case 0:
                n31 n31Var = this.f28724b;
                d31 d31Var = n31Var.G;
                d31Var.y1(true);
                b31 b31Var = n31Var.f26570s;
                b31Var.y1(true);
                n31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(b31Var);
                AndroidUtilities.updateVisibleRows(d31Var);
                return;
            default:
                n31 n31Var2 = this.f28724b;
                if (n31Var2.k()) {
                    n31Var2.l();
                    return;
                }
                return;
        }
    }
}
