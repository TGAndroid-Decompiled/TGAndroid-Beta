package org.telegram.ui.ActionBar;

import org.telegram.ui.Components.i6;
public final class z0 extends i6 {
    public final int W;
    public final d1 X;

    public z0(d1 d1Var, int i9) {
        super(false, true, true, false);
        this.W = i9;
        this.X = d1Var;
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
