package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class m71 extends g00 {
    public final p71 X;

    public m71(p71 p71Var, int i10) {
        super(i10, false);
        this.X = p71Var;
    }

    @Override
    public final int W0(s4.a1 a1Var) {
        if (this.X.Y2) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(a1Var);
    }
}
