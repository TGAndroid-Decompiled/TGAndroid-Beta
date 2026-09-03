package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class c61 extends f2.i0 {
    public final g61 I;

    public c61(g61 g61Var, int i10) {
        super(i10, false);
        this.I = g61Var;
    }

    @Override
    public final int W0(f2.i1 i1Var) {
        if (this.I.X2) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(i1Var);
    }
}
