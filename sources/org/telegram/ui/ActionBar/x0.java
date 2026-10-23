package org.telegram.ui.ActionBar;

import org.telegram.ui.Components.p6;
public final class x0 extends p6 {
    public final int f21872d0;
    public final b1 f21873e0;

    public x0(b1 b1Var, int i10) {
        super(false, true, true);
        this.f21872d0 = i10;
        this.f21873e0 = b1Var;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f21872d0) {
            case 0:
                this.f21873e0.invalidate();
                return;
            default:
                this.f21873e0.invalidate();
                return;
        }
    }
}
