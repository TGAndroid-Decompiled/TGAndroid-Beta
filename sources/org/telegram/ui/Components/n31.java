package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class n31 implements Runnable {
    public final int f30828a;
    public final e41 f30829b;

    public n31(e41 e41Var, int i10) {
        this.f30828a = i10;
        this.f30829b = e41Var;
    }

    @Override
    public final void run() {
        switch (this.f30828a) {
            case 0:
                e41 e41Var = this.f30829b;
                u31 u31Var = e41Var.G;
                u31Var.C1(true);
                s31 s31Var = e41Var.f27737s;
                s31Var.C1(true);
                e41Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(s31Var);
                AndroidUtilities.updateVisibleRows(u31Var);
                return;
            default:
                e41 e41Var2 = this.f30829b;
                if (e41Var2.l()) {
                    e41Var2.m();
                    return;
                }
                return;
        }
    }
}
