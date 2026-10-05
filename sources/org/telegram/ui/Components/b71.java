package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class b71 extends qz {
    public final e71 X;

    public b71(e71 e71Var, int i10) {
        super(i10, false);
        this.X = e71Var;
    }

    @Override
    public final int W0(s4.z0 z0Var) {
        if (this.X.f26036h3) {
            return AndroidUtilities.displaySize.y;
        }
        return super.W0(z0Var);
    }
}
