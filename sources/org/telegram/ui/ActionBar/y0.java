package org.telegram.ui.ActionBar;

import org.telegram.ui.Components.p6;
public final class y0 extends p6 {
    public final int W;
    public final c1 X;

    public y0(c1 c1Var, int i10) {
        super(false, true, true, false);
        this.W = i10;
        this.X = c1Var;
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
