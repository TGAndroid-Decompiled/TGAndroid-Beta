package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class z61 extends wz {
    public final c71 X;

    public z61(c71 c71Var, int i10) {
        super(i10, false);
        this.X = c71Var;
    }

    @Override
    public final int W0(s4.y0 y0Var) {
        if (this.X.Y2) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(y0Var);
    }
}
