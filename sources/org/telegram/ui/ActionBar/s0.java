package org.telegram.ui.ActionBar;
public final class s0 extends org.telegram.ui.Components.i6 {
    public final int f28478d0;
    public final w0 f28479e0;

    public s0(w0 w0Var, int i7) {
        super(false, true, true);
        this.f28478d0 = i7;
        this.f28479e0 = w0Var;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f28478d0) {
            case 0:
                this.f28479e0.invalidate();
                return;
            default:
                this.f28479e0.invalidate();
                return;
        }
    }
}
