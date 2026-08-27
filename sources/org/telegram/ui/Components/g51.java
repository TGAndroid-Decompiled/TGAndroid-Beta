package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

public final class g51 extends f2.k0 {
    public final k51 I;

    public g51(k51 k51Var, int i10) {
        super(i10, false);
        this.I = k51Var;
    }

    @Override
    public final int W0(f2.l1 l1Var) {
        return this.I.W2 ? AndroidUtilities.displaySize.y : super.W0(l1Var);
    }
}
