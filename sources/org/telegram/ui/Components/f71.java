package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class f71 extends zz {
    public final i71 X;

    public f71(i71 i71Var, int i10) {
        super(i10, false);
        this.X = i71Var;
    }

    @Override
    public final int W0(s4.y0 y0Var) {
        if (this.X.Y2) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(y0Var);
    }
}
