package org.telegram.ui.Components;
public final class kp0 extends r6 {
    public final int f26776d0 = 0;
    public final Object f26777e0;

    public kp0(Runnable runnable) {
        super(false, true, true, true, false);
        this.f26777e0 = runnable;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f26776d0) {
            case 0:
                ((Runnable) this.f26777e0).run();
                return;
            default:
                ((org.telegram.ui.g31) this.f26777e0).invalidate();
                return;
        }
    }

    public kp0(org.telegram.ui.g31 g31Var) {
        super(false, true, false);
        this.f26777e0 = g31Var;
    }
}
