package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class b61 extends s4.c0 {
    public final f61 I;

    public b61(f61 f61Var, int i10) {
        super(i10, false);
        this.I = f61Var;
    }

    @Override
    public final int W0(s4.z0 z0Var) {
        if (this.I.f23798a3) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(z0Var);
    }
}
