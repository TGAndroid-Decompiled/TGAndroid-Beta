package org.telegram.ui.Components;

public final class tn0 extends i6 {
    public final int W = 0;
    public final Object X;

    public tn0(Runnable runnable) {
        super(false, true, true, true);
        this.X = runnable;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.W) {
            case 0:
                ((Runnable) this.X).run();
                break;
            default:
                ((org.telegram.ui.t11) this.X).invalidate();
                break;
        }
    }

    public tn0(org.telegram.ui.t11 t11Var) {
        super(false, true, false, false);
        this.X = t11Var;
    }
}
