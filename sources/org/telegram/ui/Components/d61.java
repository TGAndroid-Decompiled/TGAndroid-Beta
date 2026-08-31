package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class d61 extends f2.j0 {
    public final i61 I;

    public d61(i61 i61Var, int i10) {
        super(i10, false);
        this.I = i61Var;
    }

    @Override
    public final int W0(f2.j1 j1Var) {
        if (this.I.X2) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(j1Var);
    }
}
