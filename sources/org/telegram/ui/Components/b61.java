package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class b61 extends nz {
    public final e61 X;

    public b61(e61 e61Var, int i10) {
        super(i10, false);
        this.X = e61Var;
    }

    @Override
    public final int W0(s4.z0 z0Var) {
        if (this.X.f23558a3) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(z0Var);
    }
}
