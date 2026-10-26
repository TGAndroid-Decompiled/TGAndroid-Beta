package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class n71 extends s4.c0 {
    public final r71 I;

    public n71(r71 r71Var, int i10) {
        super(i10, false);
        this.I = r71Var;
    }

    @Override
    public final int W0(s4.b1 b1Var) {
        if (this.I.f32154i3) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(b1Var);
    }
}
