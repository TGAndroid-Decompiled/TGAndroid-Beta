package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class o71 extends s4.c0 {
    public final s71 I;

    public o71(s71 s71Var, int i10) {
        super(i10, false);
        this.I = s71Var;
    }

    @Override
    public final int W0(s4.b1 b1Var) {
        if (this.I.f32506i3) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(b1Var);
    }
}
