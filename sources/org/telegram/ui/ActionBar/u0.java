package org.telegram.ui.ActionBar;
public final class u0 extends org.telegram.ui.Components.e6 {
    public final int f21342d0;
    public final Object f21343e0;

    public u0(y0 y0Var, int i10) {
        super(false, true, true);
        this.f21342d0 = i10;
        this.f21343e0 = y0Var;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f21342d0) {
            case 0:
                ((y0) this.f21343e0).invalidate();
                return;
            case 1:
                ((y0) this.f21343e0).invalidate();
                return;
            default:
                ((Runnable) this.f21343e0).run();
                return;
        }
    }

    public u0(Runnable runnable) {
        super(false, true, true, true, false);
        this.f21342d0 = 2;
        this.f21343e0 = runnable;
    }
}
