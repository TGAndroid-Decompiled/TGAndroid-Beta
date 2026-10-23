package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class g71 extends wz {
    public final j71 X;

    public g71(j71 j71Var, int i10) {
        super(i10, false);
        this.X = j71Var;
    }

    @Override
    public final int W0(s4.y0 y0Var) {
        if (this.X.f27541b3) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(y0Var);
    }
}
