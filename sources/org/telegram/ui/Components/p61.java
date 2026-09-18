package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p61 extends s4.c0 {
    public final t61 I;

    public p61(t61 t61Var, int i10) {
        super(i10, false);
        this.I = t61Var;
    }

    @Override
    public final int W0(s4.z0 z0Var) {
        if (this.I.f28334a3) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(z0Var);
    }
}
