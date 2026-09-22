package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class e21 implements Runnable {
    public final int f23494a;
    public final x21 f23495b;

    public e21(x21 x21Var, int i10) {
        this.f23494a = i10;
        this.f23495b = x21Var;
    }

    @Override
    public final void run() {
        switch (this.f23494a) {
            case 0:
                x21 x21Var = this.f23495b;
                n21 n21Var = x21Var.G;
                n21Var.w1(true);
                l21 l21Var = x21Var.f29877s;
                l21Var.w1(true);
                x21Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(l21Var);
                AndroidUtilities.updateVisibleRows(n21Var);
                return;
            default:
                x21 x21Var2 = this.f23495b;
                if (x21Var2.k()) {
                    x21Var2.l();
                    return;
                }
                return;
        }
    }
}
