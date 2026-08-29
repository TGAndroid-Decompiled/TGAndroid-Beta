package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class r51 extends iz {
    public final u51 X;

    public r51(u51 u51Var, int i10) {
        super(i10, false);
        this.X = u51Var;
    }

    @Override
    public final int W0(f2.k1 k1Var) {
        if (this.X.W2) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(k1Var);
    }
}
