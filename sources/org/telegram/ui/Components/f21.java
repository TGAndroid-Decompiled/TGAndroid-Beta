package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class f21 implements Runnable {
    public final int f23736a;
    public final y21 f23737b;

    public f21(y21 y21Var, int i10) {
        this.f23736a = i10;
        this.f23737b = y21Var;
    }

    @Override
    public final void run() {
        switch (this.f23736a) {
            case 0:
                y21 y21Var = this.f23737b;
                o21 o21Var = y21Var.G;
                o21Var.x1(true);
                m21 m21Var = y21Var.f30110s;
                m21Var.x1(true);
                y21Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(m21Var);
                AndroidUtilities.updateVisibleRows(o21Var);
                return;
            default:
                y21 y21Var2 = this.f23737b;
                if (y21Var2.k()) {
                    y21Var2.l();
                    return;
                }
                return;
        }
    }
}
