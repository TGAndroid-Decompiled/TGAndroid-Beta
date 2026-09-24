package org.telegram.ui.ActionBar;

import org.telegram.ui.Components.o6;
public final class x0 extends o6 {
    public final int W;
    public final b1 X;

    public x0(b1 b1Var, int i10) {
        super(false, true, true, false);
        this.W = i10;
        this.X = b1Var;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.W) {
            case 0:
                this.X.invalidate();
                return;
            default:
                this.X.invalidate();
                return;
        }
    }
}
