package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class j71 extends e00 {
    public final m71 X;

    public j71(m71 m71Var, int i10) {
        super(i10, false);
        this.X = m71Var;
    }

    @Override
    public final int W0(s4.a1 a1Var) {
        if (this.X.Y2) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(a1Var);
    }
}
