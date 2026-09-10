package org.telegram.ui.Components;
public final class so0 extends n6 {
    public final int W = 0;
    public final Object X;

    public so0(Runnable runnable) {
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
                ((org.telegram.ui.e31) this.X).invalidate();
                return;
        }
    }

    public so0(org.telegram.ui.e31 e31Var) {
        super(false, true, false, false);
        this.X = e31Var;
    }
}
