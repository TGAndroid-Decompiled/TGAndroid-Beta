package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class r61 extends nz {
    public final u61 X;

    public r61(u61 u61Var, int i10) {
        super(i10, false);
        this.X = u61Var;
    }

    @Override
    public final int W0(s4.z0 z0Var) {
        if (this.X.f28682a3) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(z0Var);
    }
}
