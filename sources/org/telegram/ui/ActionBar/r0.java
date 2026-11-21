package org.telegram.ui.ActionBar;
public final class r0 extends org.telegram.ui.Components.n6 {
    public final int f29949e0;
    public final v0 f29950f0;

    public r0(v0 v0Var, int i7) {
        super(false, true, true);
        this.f29949e0 = i7;
        this.f29950f0 = v0Var;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f29949e0) {
            case 0:
                this.f29950f0.invalidate();
                return;
            default:
                this.f29950f0.invalidate();
                return;
        }
    }
}
