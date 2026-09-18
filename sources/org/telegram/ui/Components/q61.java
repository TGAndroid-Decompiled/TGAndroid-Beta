package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class q61 extends nz {
    public final t61 X;

    public q61(t61 t61Var, int i10) {
        super(i10, false);
        this.X = t61Var;
    }

    @Override
    public final int W0(s4.z0 z0Var) {
        if (this.X.f28334a3) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(z0Var);
    }
}
