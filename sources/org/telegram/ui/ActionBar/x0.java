package org.telegram.ui.ActionBar;
public final class x0 extends org.telegram.ui.Components.p6 {
    public final int f21952d0;
    public final b1 f21953e0;

    public x0(b1 b1Var, int i10) {
        super(false, true, true);
        this.f21952d0 = i10;
        this.f21953e0 = b1Var;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f21952d0) {
            case 0:
                this.f21953e0.invalidate();
                return;
            default:
                this.f21953e0.invalidate();
                return;
        }
    }
}
