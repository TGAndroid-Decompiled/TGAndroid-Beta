package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class j31 implements Runnable {
    public final int f27571a;
    public final c41 f27572b;

    public j31(c41 c41Var, int i10) {
        this.f27571a = i10;
        this.f27572b = c41Var;
    }

    @Override
    public final void run() {
        switch (this.f27571a) {
            case 0:
                c41 c41Var = this.f27572b;
                s31 s31Var = c41Var.G;
                s31Var.x1(true);
                q31 q31Var = c41Var.f25247s;
                q31Var.x1(true);
                c41Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(q31Var);
                AndroidUtilities.updateVisibleRows(s31Var);
                return;
            default:
                c41 c41Var2 = this.f27572b;
                if (c41Var2.k()) {
                    c41Var2.l();
                    return;
                }
                return;
        }
    }
}
