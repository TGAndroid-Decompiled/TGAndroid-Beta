package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class g31 implements Runnable {
    public final int f24871a;
    public final y31 f24872b;

    public g31(y31 y31Var, int i10) {
        this.f24871a = i10;
        this.f24872b = y31Var;
    }

    @Override
    public final void run() {
        switch (this.f24871a) {
            case 0:
                y31 y31Var = this.f24872b;
                o31 o31Var = y31Var.G;
                o31Var.x1(true);
                m31 m31Var = y31Var.f31143s;
                m31Var.x1(true);
                y31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(m31Var);
                AndroidUtilities.updateVisibleRows(o31Var);
                return;
            default:
                y31 y31Var2 = this.f24872b;
                if (y31Var2.k()) {
                    y31Var2.l();
                    return;
                }
                return;
        }
    }
}
