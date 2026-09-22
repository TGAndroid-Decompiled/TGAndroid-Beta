package org.telegram.ui.Components;
public final class yo0 extends n6 {
    public final int W = 0;
    public final Object X;

    public yo0(Runnable runnable) {
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
                ((org.telegram.ui.z21) this.X).invalidate();
                return;
        }
    }

    public yo0(org.telegram.ui.z21 z21Var) {
        super(false, true, false, false);
        this.X = z21Var;
    }
}
