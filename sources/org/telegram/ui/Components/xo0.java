package org.telegram.ui.Components;
public final class xo0 extends o6 {
    public final int W = 0;
    public final Object X;

    public xo0(Runnable runnable) {
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
                ((org.telegram.ui.q21) this.X).invalidate();
                return;
        }
    }

    public xo0(org.telegram.ui.q21 q21Var) {
        super(false, true, false, false);
        this.X = q21Var;
    }
}
