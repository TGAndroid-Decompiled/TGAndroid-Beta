package org.telegram.ui.Components;
public final class op0 extends q6 {
    public final int f29556d0 = 0;
    public final Object f29557e0;

    public op0(Runnable runnable) {
        super(false, true, true, true, false);
        this.f29557e0 = runnable;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f29556d0) {
            case 0:
                ((Runnable) this.f29557e0).run();
                return;
            default:
                ((org.telegram.ui.y21) this.f29557e0).invalidate();
                return;
        }
    }

    public op0(org.telegram.ui.y21 y21Var) {
        super(false, true, false);
        this.f29557e0 = y21Var;
    }
}
