package org.telegram.ui.Components;
public final class jo0 extends o6 {
    public final int W = 0;
    public final Object X;

    public jo0(Runnable runnable) {
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
                ((org.telegram.ui.r21) this.X).invalidate();
                return;
        }
    }

    public jo0(org.telegram.ui.r21 r21Var) {
        super(false, true, false, false);
        this.X = r21Var;
    }
}
