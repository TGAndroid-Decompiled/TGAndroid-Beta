package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class o61 extends oz {
    public final r61 X;

    public o61(r61 r61Var, int i10) {
        super(i10, false);
        this.X = r61Var;
    }

    @Override
    public final int W0(s4.z0 z0Var) {
        if (this.X.f27876a3) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(z0Var);
    }
}
