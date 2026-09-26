package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p61 extends pz {
    public final s61 X;

    public p61(s61 s61Var, int i10) {
        super(i10, false);
        this.X = s61Var;
    }

    @Override
    public final int W0(s4.z0 z0Var) {
        if (this.X.f28177a3) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(z0Var);
    }
}
