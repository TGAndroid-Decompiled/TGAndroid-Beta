package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class d71 extends s4.b0 {
    public final h71 I;

    public d71(h71 h71Var, int i10) {
        super(i10, false);
        this.I = h71Var;
    }

    @Override
    public final int W0(s4.y0 y0Var) {
        if (this.I.Y2) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(y0Var);
    }
}
