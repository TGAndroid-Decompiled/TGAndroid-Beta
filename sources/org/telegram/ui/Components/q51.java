package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class q51 extends f2.j0 {
    public final u51 I;

    public q51(u51 u51Var, int i10) {
        super(i10, false);
        this.I = u51Var;
    }

    @Override
    public final int W0(f2.k1 k1Var) {
        if (this.I.W2) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(k1Var);
    }
}
