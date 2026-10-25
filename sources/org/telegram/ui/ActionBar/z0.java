package org.telegram.ui.ActionBar;
public final class z0 extends org.telegram.ui.Components.r6 {
    public final int f23779d0;
    public final d1 f23780e0;

    public z0(d1 d1Var, int i10) {
        super(false, true, true);
        this.f23779d0 = i10;
        this.f23780e0 = d1Var;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f23779d0) {
            case 0:
                this.f23780e0.invalidate();
                return;
            default:
                this.f23780e0.invalidate();
                return;
        }
    }
}
