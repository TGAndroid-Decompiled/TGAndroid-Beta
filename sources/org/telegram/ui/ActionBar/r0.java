package org.telegram.ui.ActionBar;
public final class r0 extends org.telegram.ui.Components.g6 {
    public final int f28493d0;
    public final v0 f28494e0;

    public r0(v0 v0Var, int i3) {
        super(false, true, true);
        this.f28493d0 = i3;
        this.f28494e0 = v0Var;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f28493d0) {
            case 0:
                this.f28494e0.invalidate();
                return;
            default:
                this.f28494e0.invalidate();
                return;
        }
    }
}
