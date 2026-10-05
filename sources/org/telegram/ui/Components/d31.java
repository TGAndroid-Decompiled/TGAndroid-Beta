package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class d31 implements Runnable {
    public final int f25615a;
    public final w31 f25616b;

    public d31(w31 w31Var, int i10) {
        this.f25615a = i10;
        this.f25616b = w31Var;
    }

    @Override
    public final void run() {
        switch (this.f25615a) {
            case 0:
                w31 w31Var = this.f25616b;
                m31 m31Var = w31Var.G;
                m31Var.x1(true);
                k31 k31Var = w31Var.f32510s;
                k31Var.x1(true);
                w31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(k31Var);
                AndroidUtilities.updateVisibleRows(m31Var);
                return;
            default:
                w31 w31Var2 = this.f25616b;
                if (w31Var2.k()) {
                    w31Var2.l();
                    return;
                }
                return;
        }
    }
}
