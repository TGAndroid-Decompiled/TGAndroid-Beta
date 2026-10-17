package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class x61 extends wz {
    public final a71 X;

    public x61(a71 a71Var, int i10) {
        super(i10, false);
        this.X = a71Var;
    }

    @Override
    public final int W0(s4.y0 y0Var) {
        if (this.X.Y2) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(y0Var);
    }
}
