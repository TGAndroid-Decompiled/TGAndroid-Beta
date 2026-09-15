package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class a61 extends s4.c0 {
    public final e61 I;

    public a61(e61 e61Var, int i10) {
        super(i10, false);
        this.I = e61Var;
    }

    @Override
    public final int W0(s4.z0 z0Var) {
        if (this.I.f23558a3) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(z0Var);
    }
}
