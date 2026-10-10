package org.telegram.ui.ActionBar;

import org.telegram.ui.Components.q6;
public final class y0 extends q6 {
    public final int f21719d0;
    public final c1 f21720e0;

    public y0(c1 c1Var, int i10) {
        super(false, true, true);
        this.f21719d0 = i10;
        this.f21720e0 = c1Var;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f21719d0) {
            case 0:
                this.f21720e0.invalidate();
                return;
            default:
                this.f21720e0.invalidate();
                return;
        }
    }
}
