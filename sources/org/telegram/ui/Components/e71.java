package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class e71 extends zz {
    public final h71 X;

    public e71(h71 h71Var, int i10) {
        super(i10, false);
        this.X = h71Var;
    }

    @Override
    public final int W0(s4.y0 y0Var) {
        if (this.X.Y2) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(y0Var);
    }
}
