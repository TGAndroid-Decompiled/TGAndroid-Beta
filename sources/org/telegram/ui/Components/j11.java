package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class j11 implements Runnable {
    public final int f29587a;
    public final b21 f29588b;

    public j11(b21 b21Var, int i9) {
        this.f29587a = i9;
        this.f29588b = b21Var;
    }

    @Override
    public final void run() {
        switch (this.f29587a) {
            case 0:
                b21 b21Var = this.f29588b;
                q11 q11Var = b21Var.C;
                q11Var.w1(true);
                o11 o11Var = b21Var.f27007s;
                o11Var.w1(true);
                b21Var.F.a(true, true);
                AndroidUtilities.updateVisibleRows(o11Var);
                AndroidUtilities.updateVisibleRows(q11Var);
                return;
            default:
                b21 b21Var2 = this.f29588b;
                if (b21Var2.k()) {
                    b21Var2.l();
                    return;
                }
                return;
        }
    }
}
