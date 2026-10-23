package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class f71 extends s4.b0 {
    public final j71 I;

    public f71(j71 j71Var, int i10) {
        super(i10, false);
        this.I = j71Var;
    }

    @Override
    public final int W0(s4.y0 y0Var) {
        if (this.I.f27541b3) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(y0Var);
    }
}
