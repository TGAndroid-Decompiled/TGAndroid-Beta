package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class v11 implements Runnable {
    public final int f33419a;
    public final m21 f33420b;

    public v11(m21 m21Var, int i10) {
        this.f33419a = i10;
        this.f33420b = m21Var;
    }

    @Override
    public final void run() {
        switch (this.f33419a) {
            case 0:
                m21 m21Var = this.f33420b;
                c21 c21Var = m21Var.C;
                c21Var.w1(true);
                a21 a21Var = m21Var.f30558s;
                a21Var.w1(true);
                m21Var.F.a(true, true);
                AndroidUtilities.updateVisibleRows(a21Var);
                AndroidUtilities.updateVisibleRows(c21Var);
                return;
            default:
                m21 m21Var2 = this.f33420b;
                if (m21Var2.k()) {
                    m21Var2.l();
                    return;
                }
                return;
        }
    }
}
