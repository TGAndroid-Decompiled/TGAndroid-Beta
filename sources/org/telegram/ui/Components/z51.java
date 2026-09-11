package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class z51 extends s4.c0 {
    public final d61 I;

    public z51(d61 d61Var, int i10) {
        super(i10, false);
        this.I = d61Var;
    }

    @Override
    public final int W0(s4.z0 z0Var) {
        if (this.I.f25279a3) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(z0Var);
    }
}
