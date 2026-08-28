package org.telegram.ui.Components;
public final class sn0 extends i6 {
    public final int W = 0;
    public final Object X;

    public sn0(Runnable runnable) {
        super(false, true, true, true);
        this.X = runnable;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.W) {
            case 0:
                ((Runnable) this.X).run();
                return;
            default:
                ((org.telegram.ui.u11) this.X).invalidate();
                return;
        }
    }

    public sn0(org.telegram.ui.u11 u11Var) {
        super(false, true, false, false);
        this.X = u11Var;
    }
}
