package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class o61 extends s4.c0 {
    public final s61 I;

    public o61(s61 s61Var, int i10) {
        super(i10, false);
        this.I = s61Var;
    }

    @Override
    public final int W0(s4.z0 z0Var) {
        if (this.I.f28063a3) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(z0Var);
    }
}
