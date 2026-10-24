package org.telegram.ui.ActionBar;
public final class x0 extends org.telegram.ui.Components.n6 {
    public final int f21953d0;
    public final b1 f21954e0;

    public x0(b1 b1Var, int i10) {
        super(false, true, true);
        this.f21953d0 = i10;
        this.f21954e0 = b1Var;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f21953d0) {
            case 0:
                this.f21954e0.invalidate();
                return;
            default:
                this.f21954e0.invalidate();
                return;
        }
    }
}
