package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p31 implements Runnable {
    public final int f29359a;
    public final h41 f29360b;

    public p31(h41 h41Var, int i10) {
        this.f29359a = i10;
        this.f29360b = h41Var;
    }

    @Override
    public final void run() {
        switch (this.f29359a) {
            case 0:
                h41 h41Var = this.f29360b;
                x31 x31Var = h41Var.G;
                x31Var.x1(true);
                v31 v31Var = h41Var.f26650s;
                v31Var.x1(true);
                h41Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(v31Var);
                AndroidUtilities.updateVisibleRows(x31Var);
                return;
            default:
                h41 h41Var2 = this.f29360b;
                if (h41Var2.k()) {
                    h41Var2.l();
                    return;
                }
                return;
        }
    }
}
