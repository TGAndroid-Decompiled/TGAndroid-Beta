package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

public final class m11 implements Runnable {

    public final int f30527a;

    public final d21 f30528b;

    public m11(d21 d21Var, int i10) {
        this.f30527a = i10;
        this.f30528b = d21Var;
    }

    @Override
    public final void run() {
        switch (this.f30527a) {
            case 0:
                d21 d21Var = this.f30528b;
                t11 t11Var = d21Var.C;
                t11Var.w1(true);
                r11 r11Var = d21Var.f27631s;
                r11Var.w1(true);
                d21Var.F.a(true, true);
                AndroidUtilities.updateVisibleRows(r11Var);
                AndroidUtilities.updateVisibleRows(t11Var);
                break;
            default:
                d21 d21Var2 = this.f30528b;
                if (d21Var2.k()) {
                    d21Var2.l();
                }
                break;
        }
    }
}
