package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class e21 implements Runnable {
    public final int f23497a;
    public final x21 f23498b;

    public e21(x21 x21Var, int i10) {
        this.f23497a = i10;
        this.f23498b = x21Var;
    }

    @Override
    public final void run() {
        switch (this.f23497a) {
            case 0:
                x21 x21Var = this.f23498b;
                n21 n21Var = x21Var.G;
                n21Var.w1(true);
                l21 l21Var = x21Var.f29880s;
                l21Var.w1(true);
                x21Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(l21Var);
                AndroidUtilities.updateVisibleRows(n21Var);
                return;
            default:
                x21 x21Var2 = this.f23498b;
                if (x21Var2.k()) {
                    x21Var2.l();
                    return;
                }
                return;
        }
    }
}
