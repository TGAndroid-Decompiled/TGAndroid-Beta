package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p71 extends vz {
    public final s71 X;

    public p71(s71 s71Var, int i10) {
        super(i10, false);
        this.X = s71Var;
    }

    @Override
    public final int W0(s4.b1 b1Var) {
        if (this.X.f32506i3) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(b1Var);
    }
}
