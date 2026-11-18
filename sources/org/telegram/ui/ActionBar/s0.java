package org.telegram.ui.ActionBar;
public final class s0 extends org.telegram.ui.Components.m6 {
    public final int f29968e0;
    public final w0 f29969f0;

    public s0(w0 w0Var, int i7) {
        super(false, true, true);
        this.f29968e0 = i7;
        this.f29969f0 = w0Var;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f29968e0) {
            case 0:
                this.f29969f0.invalidate();
                return;
            default:
                this.f29969f0.invalidate();
                return;
        }
    }
}
