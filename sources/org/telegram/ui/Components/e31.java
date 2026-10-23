package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class e31 implements Runnable {
    public final int f25813a;
    public final w31 f25814b;

    public e31(w31 w31Var, int i10) {
        this.f25813a = i10;
        this.f25814b = w31Var;
    }

    @Override
    public final void run() {
        switch (this.f25813a) {
            case 0:
                w31 w31Var = this.f25814b;
                l31 l31Var = w31Var.G;
                l31Var.C1(true);
                j31 j31Var = w31Var.f32144s;
                j31Var.C1(true);
                w31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(j31Var);
                AndroidUtilities.updateVisibleRows(l31Var);
                return;
            default:
                w31 w31Var2 = this.f25814b;
                if (w31Var2.l()) {
                    w31Var2.m();
                    return;
                }
                return;
        }
    }
}
