package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class a61 extends nz {
    public final d61 X;

    public a61(d61 d61Var, int i10) {
        super(i10, false);
        this.X = d61Var;
    }

    @Override
    public final int W0(s4.z0 z0Var) {
        if (this.X.f25306a3) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(z0Var);
    }
}
