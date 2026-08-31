package org.telegram.ui.Components;
public final class oo0 extends j6 {
    public final int W = 0;
    public final Object X;

    public oo0(Runnable runnable) {
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
                ((org.telegram.ui.j21) this.X).invalidate();
                return;
        }
    }

    public oo0(org.telegram.ui.j21 j21Var) {
        super(false, true, false, false);
        this.X = j21Var;
    }
}
