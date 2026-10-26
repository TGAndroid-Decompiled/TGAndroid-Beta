package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class o71 extends vz {
    public final r71 X;

    public o71(r71 r71Var, int i10) {
        super(i10, false);
        this.X = r71Var;
    }

    @Override
    public final int W0(s4.b1 b1Var) {
        if (this.X.f32154i3) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(b1Var);
    }
}
