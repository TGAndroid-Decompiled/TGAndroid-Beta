package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class h71 extends d00 {
    public final k71 X;

    public h71(k71 k71Var, int i10) {
        super(i10, false);
        this.X = k71Var;
    }

    @Override
    public final int W0(s4.a1 a1Var) {
        if (this.X.Y2) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(a1Var);
    }
}
