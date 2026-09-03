package org.telegram.ui.Components;
public final class no0 extends j6 {
    public final int W = 0;
    public final Object X;

    public no0(Runnable runnable) {
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
                ((org.telegram.ui.o21) this.X).invalidate();
                return;
        }
    }

    public no0(org.telegram.ui.o21 o21Var) {
        super(false, true, false, false);
        this.X = o21Var;
    }
}
