package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class t21 implements Runnable {
    public final int f28290a;
    public final m31 f28291b;

    public t21(m31 m31Var, int i10) {
        this.f28290a = i10;
        this.f28291b = m31Var;
    }

    @Override
    public final void run() {
        switch (this.f28290a) {
            case 0:
                m31 m31Var = this.f28291b;
                c31 c31Var = m31Var.G;
                c31Var.x1(true);
                a31 a31Var = m31Var.f26318s;
                a31Var.x1(true);
                m31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(a31Var);
                AndroidUtilities.updateVisibleRows(c31Var);
                return;
            default:
                m31 m31Var2 = this.f28291b;
                if (m31Var2.k()) {
                    m31Var2.l();
                    return;
                }
                return;
        }
    }
}
