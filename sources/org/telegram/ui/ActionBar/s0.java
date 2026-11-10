package org.telegram.ui.ActionBar;
public final class s0 extends org.telegram.ui.Components.h6 {
    public final int f28479d0;
    public final w0 f28480e0;

    public s0(w0 w0Var, int i7) {
        super(false, true, true);
        this.f28479d0 = i7;
        this.f28480e0 = w0Var;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f28479d0) {
            case 0:
                this.f28480e0.invalidate();
                return;
            default:
                this.f28480e0.invalidate();
                return;
        }
    }
}
