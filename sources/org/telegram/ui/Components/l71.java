package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class l71 extends s4.d0 {
    public final p71 I;

    public l71(p71 p71Var, int i10) {
        super(i10, false);
        this.I = p71Var;
    }

    @Override
    public final int W0(s4.a1 a1Var) {
        if (this.I.Y2) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(a1Var);
    }
}
