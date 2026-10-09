package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class g71 extends s4.d0 {
    public final k71 I;

    public g71(k71 k71Var, int i10) {
        super(i10, false);
        this.I = k71Var;
    }

    @Override
    public final int W0(s4.a1 a1Var) {
        if (this.I.Y2) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(a1Var);
    }
}
