package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class y61 extends wz {
    public final b71 X;

    public y61(b71 b71Var, int i10) {
        super(i10, false);
        this.X = b71Var;
    }

    @Override
    public final int W0(s4.y0 y0Var) {
        if (this.X.Y2) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(y0Var);
    }
}
