package org.telegram.ui.Components;
public final class qp0 extends q6 {
    public final int f30220d0 = 0;
    public final Object f30221e0;

    public qp0(Runnable runnable) {
        super(false, true, true, true, false);
        this.f30221e0 = runnable;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f30220d0) {
            case 0:
                ((Runnable) this.f30221e0).run();
                return;
            default:
                ((org.telegram.ui.x21) this.f30221e0).invalidate();
                return;
        }
    }

    public qp0(org.telegram.ui.x21 x21Var) {
        super(false, true, false);
        this.f30221e0 = x21Var;
    }
}
