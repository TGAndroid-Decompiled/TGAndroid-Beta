package org.telegram.ui.ActionBar;
public final class s0 extends org.telegram.ui.Components.g6 {
    public final int f29580e0;
    public final w0 f29581f0;

    public s0(w0 w0Var, int i7) {
        super(false, true, true);
        this.f29580e0 = i7;
        this.f29581f0 = w0Var;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f29580e0) {
            case 0:
                this.f29581f0.invalidate();
                return;
            default:
                this.f29581f0.invalidate();
                return;
        }
    }
}
