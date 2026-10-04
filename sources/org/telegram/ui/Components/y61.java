package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class y61 extends s4.c0 {
    public final c71 I;

    public y61(c71 c71Var, int i10) {
        super(i10, false);
        this.I = c71Var;
    }

    @Override
    public final int W0(s4.z0 z0Var) {
        if (this.I.f25246h3) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(z0Var);
    }
}
