package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class i71 extends s4.d0 {
    public final m71 I;

    public i71(m71 m71Var, int i10) {
        super(i10, false);
        this.I = m71Var;
    }

    @Override
    public final int W0(s4.a1 a1Var) {
        if (this.I.Y2) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(a1Var);
    }
}
