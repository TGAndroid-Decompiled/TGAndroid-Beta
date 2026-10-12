package org.telegram.ui.ActionBar;

import org.telegram.ui.Components.r6;
public final class x0 extends r6 {
    public final int f20802d0;
    public final b1 f20803e0;

    public x0(b1 b1Var, int i10) {
        super(false, true, true);
        this.f20802d0 = i10;
        this.f20803e0 = b1Var;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f20802d0) {
            case 0:
                this.f20803e0.invalidate();
                return;
            default:
                this.f20803e0.invalidate();
                return;
        }
    }
}
