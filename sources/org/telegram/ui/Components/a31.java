package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class a31 implements Runnable {
    public final int f24486a;
    public final s31 f24487b;

    public a31(s31 s31Var, int i10) {
        this.f24486a = i10;
        this.f24487b = s31Var;
    }

    @Override
    public final void run() {
        switch (this.f24486a) {
            case 0:
                s31 s31Var = this.f24487b;
                h31 h31Var = s31Var.G;
                h31Var.x1(true);
                f31 f31Var = s31Var.f30193s;
                f31Var.x1(true);
                s31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(f31Var);
                AndroidUtilities.updateVisibleRows(h31Var);
                return;
            default:
                s31 s31Var2 = this.f24487b;
                if (s31Var2.k()) {
                    s31Var2.l();
                    return;
                }
                return;
        }
    }
}
