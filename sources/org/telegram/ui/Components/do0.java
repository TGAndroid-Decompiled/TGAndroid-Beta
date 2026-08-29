package org.telegram.ui.Components;
public final class do0 extends n6 {
    public final int W = 0;
    public final Object X;

    public do0(Runnable runnable) {
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
                ((org.telegram.ui.v11) this.X).invalidate();
                return;
        }
    }

    public do0(org.telegram.ui.v11 v11Var) {
        super(false, true, false, false);
        this.X = v11Var;
    }
}
