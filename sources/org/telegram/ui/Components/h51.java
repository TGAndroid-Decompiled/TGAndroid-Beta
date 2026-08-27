package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

public final class h51 extends bz {
    public final k51 X;

    public h51(k51 k51Var, int i10) {
        super(i10, false);
        this.X = k51Var;
    }

    @Override
    public final int W0(f2.l1 l1Var) {
        return this.X.W2 ? AndroidUtilities.displaySize.y : super.W0(l1Var);
    }
}
