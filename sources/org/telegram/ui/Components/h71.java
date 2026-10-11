package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class h71 extends s4.d0 {
    public final l71 I;

    public h71(l71 l71Var, int i10) {
        super(i10, false);
        this.I = l71Var;
    }

    @Override
    public final int W0(s4.a1 a1Var) {
        if (this.I.Y2) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(a1Var);
    }
}
