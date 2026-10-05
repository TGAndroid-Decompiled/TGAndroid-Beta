package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class a71 extends s4.c0 {
    public final e71 I;

    public a71(e71 e71Var, int i10) {
        super(i10, false);
        this.I = e71Var;
    }

    @Override
    public final int W0(s4.z0 z0Var) {
        if (this.I.f26036h3) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(z0Var);
    }
}
