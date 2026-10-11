package org.telegram.ui.ActionBar;

import org.telegram.ui.Components.q6;
public final class x0 extends q6 {
    public final int f21669d0;
    public final b1 f21670e0;

    public x0(b1 b1Var, int i10) {
        super(false, true, true);
        this.f21669d0 = i10;
        this.f21670e0 = b1Var;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f21669d0) {
            case 0:
                this.f21670e0.invalidate();
                return;
            default:
                this.f21670e0.invalidate();
                return;
        }
    }
}
