package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class t21 implements Runnable {
    public final int f28429a;
    public final m31 f28430b;

    public t21(m31 m31Var, int i10) {
        this.f28429a = i10;
        this.f28430b = m31Var;
    }

    @Override
    public final void run() {
        switch (this.f28429a) {
            case 0:
                m31 m31Var = this.f28430b;
                c31 c31Var = m31Var.G;
                c31Var.w1(true);
                a31 a31Var = m31Var.f26281s;
                a31Var.w1(true);
                m31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(a31Var);
                AndroidUtilities.updateVisibleRows(c31Var);
                return;
            default:
                m31 m31Var2 = this.f28430b;
                if (m31Var2.k()) {
                    m31Var2.l();
                    return;
                }
                return;
        }
    }
}
