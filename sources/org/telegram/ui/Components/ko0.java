package org.telegram.ui.Components;
public final class ko0 extends m6 {
    public final int W = 0;
    public final Object X;

    public ko0(Runnable runnable) {
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
                ((org.telegram.ui.a31) this.X).invalidate();
                return;
        }
    }

    public ko0(org.telegram.ui.a31 a31Var) {
        super(false, true, false, false);
        this.X = a31Var;
    }
}
