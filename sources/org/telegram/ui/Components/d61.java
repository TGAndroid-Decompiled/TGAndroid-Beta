package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class d61 extends pz {
    public final h61 X;

    public d61(h61 h61Var, int i10) {
        super(i10, false);
        this.X = h61Var;
    }

    @Override
    public final int W0(f2.j1 j1Var) {
        if (this.X.X2) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(j1Var);
    }
}
