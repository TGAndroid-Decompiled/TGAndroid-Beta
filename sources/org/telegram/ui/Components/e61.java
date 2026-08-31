package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class e61 extends pz {
    public final i61 X;

    public e61(i61 i61Var, int i10) {
        super(i10, false);
        this.X = i61Var;
    }

    @Override
    public final int W0(f2.j1 j1Var) {
        if (this.X.X2) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(j1Var);
    }
}
