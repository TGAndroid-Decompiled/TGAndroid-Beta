package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class t21 implements Runnable {
    public final int f28428a;
    public final m31 f28429b;

    public t21(m31 m31Var, int i10) {
        this.f28428a = i10;
        this.f28429b = m31Var;
    }

    @Override
    public final void run() {
        switch (this.f28428a) {
            case 0:
                m31 m31Var = this.f28429b;
                c31 c31Var = m31Var.G;
                c31Var.w1(true);
                a31 a31Var = m31Var.f26280s;
                a31Var.w1(true);
                m31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(a31Var);
                AndroidUtilities.updateVisibleRows(c31Var);
                return;
            default:
                m31 m31Var2 = this.f28429b;
                if (m31Var2.k()) {
                    m31Var2.l();
                    return;
                }
                return;
        }
    }
}
