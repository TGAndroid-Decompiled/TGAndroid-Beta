package org.telegram.ui.ActionBar;

import org.telegram.ui.Components.q6;
public final class y0 extends q6 {
    public final int f21715d0;
    public final c1 f21716e0;

    public y0(c1 c1Var, int i10) {
        super(false, true, true);
        this.f21715d0 = i10;
        this.f21716e0 = c1Var;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f21715d0) {
            case 0:
                this.f21716e0.invalidate();
                return;
            default:
                this.f21716e0.invalidate();
                return;
        }
    }
}
