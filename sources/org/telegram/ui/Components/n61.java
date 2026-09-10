package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class n61 extends s4.c0 {
    public final r61 I;

    public n61(r61 r61Var, int i10) {
        super(i10, false);
        this.I = r61Var;
    }

    @Override
    public final int W0(s4.z0 z0Var) {
        if (this.I.f26604a3) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(z0Var);
    }
}
