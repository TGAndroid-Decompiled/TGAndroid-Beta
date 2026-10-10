package org.telegram.ui.Components;
public final class pp0 extends q6 {
    public final int f29834d0 = 0;
    public final Object f29835e0;

    public pp0(Runnable runnable) {
        super(false, true, true, true, false);
        this.f29835e0 = runnable;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f29834d0) {
            case 0:
                ((Runnable) this.f29835e0).run();
                return;
            default:
                ((org.telegram.ui.y21) this.f29835e0).invalidate();
                return;
        }
    }

    public pp0(org.telegram.ui.y21 y21Var) {
        super(false, true, false);
        this.f29835e0 = y21Var;
    }
}
