package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class g21 implements Runnable {
    public final int f27083a;
    public final x21 f27084b;

    public g21(x21 x21Var, int i10) {
        this.f27083a = i10;
        this.f27084b = x21Var;
    }

    @Override
    public final void run() {
        switch (this.f27083a) {
            case 0:
                x21 x21Var = this.f27084b;
                n21 n21Var = x21Var.D;
                n21Var.w1(true);
                l21 l21Var = x21Var.f32935s;
                l21Var.w1(true);
                x21Var.G.a(true, true);
                AndroidUtilities.updateVisibleRows(l21Var);
                AndroidUtilities.updateVisibleRows(n21Var);
                return;
            default:
                x21 x21Var2 = this.f27084b;
                if (x21Var2.k()) {
                    x21Var2.l();
                    return;
                }
                return;
        }
    }
}
