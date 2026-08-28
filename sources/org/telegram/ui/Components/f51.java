package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class f51 extends zy {
    public final i51 X;

    public f51(i51 i51Var, int i9) {
        super(i9, false);
        this.X = i51Var;
    }

    @Override
    public final int W0(f2.n1 n1Var) {
        if (this.X.W2) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(n1Var);
    }
}
