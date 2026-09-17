package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class f21 implements Runnable {
    public final int f23733a;
    public final y21 f23734b;

    public f21(y21 y21Var, int i10) {
        this.f23733a = i10;
        this.f23734b = y21Var;
    }

    @Override
    public final void run() {
        switch (this.f23733a) {
            case 0:
                y21 y21Var = this.f23734b;
                o21 o21Var = y21Var.G;
                o21Var.x1(true);
                m21 m21Var = y21Var.f30107s;
                m21Var.x1(true);
                y21Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(m21Var);
                AndroidUtilities.updateVisibleRows(o21Var);
                return;
            default:
                y21 y21Var2 = this.f23734b;
                if (y21Var2.k()) {
                    y21Var2.l();
                    return;
                }
                return;
        }
    }
}
