package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class e51 extends f2.m0 {
    public final i51 I;

    public e51(i51 i51Var, int i9) {
        super(i9, false);
        this.I = i51Var;
    }

    @Override
    public final int W0(f2.n1 n1Var) {
        if (this.I.W2) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(n1Var);
    }
}
