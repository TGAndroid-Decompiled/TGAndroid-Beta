package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class l31 implements Runnable {
    public final int f28148a;
    public final e41 f28149b;

    public l31(e41 e41Var, int i10) {
        this.f28148a = i10;
        this.f28149b = e41Var;
    }

    @Override
    public final void run() {
        switch (this.f28148a) {
            case 0:
                e41 e41Var = this.f28149b;
                u31 u31Var = e41Var.G;
                u31Var.x1(true);
                s31 s31Var = e41Var.f25852s;
                s31Var.x1(true);
                e41Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(s31Var);
                AndroidUtilities.updateVisibleRows(u31Var);
                return;
            default:
                e41 e41Var2 = this.f28149b;
                if (e41Var2.k()) {
                    e41Var2.l();
                    return;
                }
                return;
        }
    }
}
