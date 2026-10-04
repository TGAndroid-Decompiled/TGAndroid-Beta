package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class z61 extends qz {
    public final c71 X;

    public z61(c71 c71Var, int i10) {
        super(i10, false);
        this.X = c71Var;
    }

    @Override
    public final int W0(s4.z0 z0Var) {
        if (this.X.f25246h3) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(z0Var);
    }
}
