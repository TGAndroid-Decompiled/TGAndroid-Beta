package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class i71 extends e00 {
    public final l71 X;

    public i71(l71 l71Var, int i10) {
        super(i10, false);
        this.X = l71Var;
    }

    @Override
    public final int W0(s4.a1 a1Var) {
        if (this.X.Y2) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(a1Var);
    }
}
