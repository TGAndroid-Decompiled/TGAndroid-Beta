package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class q61 extends s4.c0 {
    public final u61 I;

    public q61(u61 u61Var, int i10) {
        super(i10, false);
        this.I = u61Var;
    }

    @Override
    public final int W0(s4.z0 z0Var) {
        if (this.I.f28682a3) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(z0Var);
    }
}
