package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class f31 implements Runnable {
    public final int f24878a;
    public final y31 f24879b;

    public f31(y31 y31Var, int i10) {
        this.f24878a = i10;
        this.f24879b = y31Var;
    }

    @Override
    public final void run() {
        switch (this.f24878a) {
            case 0:
                y31 y31Var = this.f24879b;
                o31 o31Var = y31Var.G;
                o31Var.x1(true);
                m31 m31Var = y31Var.f31481s;
                m31Var.x1(true);
                y31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(m31Var);
                AndroidUtilities.updateVisibleRows(o31Var);
                return;
            default:
                y31 y31Var2 = this.f24879b;
                if (y31Var2.k()) {
                    y31Var2.l();
                    return;
                }
                return;
        }
    }
}
