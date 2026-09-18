package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class c61 extends nz {
    public final f61 X;

    public c61(f61 f61Var, int i10) {
        super(i10, false);
        this.X = f61Var;
    }

    @Override
    public final int W0(s4.z0 z0Var) {
        if (this.X.f23798a3) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(z0Var);
    }
}
