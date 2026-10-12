package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p31 implements Runnable {
    public final int f29356a;
    public final h41 f29357b;

    public p31(h41 h41Var, int i10) {
        this.f29356a = i10;
        this.f29357b = h41Var;
    }

    @Override
    public final void run() {
        switch (this.f29356a) {
            case 0:
                h41 h41Var = this.f29357b;
                x31 x31Var = h41Var.G;
                x31Var.x1(true);
                v31 v31Var = h41Var.f26646s;
                v31Var.x1(true);
                h41Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(v31Var);
                AndroidUtilities.updateVisibleRows(x31Var);
                return;
            default:
                h41 h41Var2 = this.f29357b;
                if (h41Var2.k()) {
                    h41Var2.l();
                    return;
                }
                return;
        }
    }
}
