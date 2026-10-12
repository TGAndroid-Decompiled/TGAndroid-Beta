package org.telegram.ui.Components;
public final class up0 extends q6 {
    public final int f31243d0 = 0;
    public final Object f31244e0;

    public up0(Runnable runnable) {
        super(false, true, true, true, false);
        this.f31244e0 = runnable;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f31243d0) {
            case 0:
                ((Runnable) this.f31244e0).run();
                return;
            default:
                ((org.telegram.ui.b31) this.f31244e0).invalidate();
                return;
        }
    }

    public up0(org.telegram.ui.b31 b31Var) {
        super(false, true, false);
        this.f31244e0 = b31Var;
    }
}
