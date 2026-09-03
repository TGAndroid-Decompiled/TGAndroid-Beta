package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class d61 extends nz {
    public final g61 X;

    public d61(g61 g61Var, int i10) {
        super(i10, false);
        this.X = g61Var;
    }

    @Override
    public final int W0(f2.i1 i1Var) {
        if (this.X.X2) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(i1Var);
    }
}
