package org.telegram.ui;
public final class a20 extends org.telegram.ui.Components.vf0 {
    public final c40 f44924t1;

    public a20(c40 c40Var, LaunchActivity launchActivity, a30 a30Var, k30 k30Var, z10 z10Var) {
        super(launchActivity, a30Var, k30Var, z10Var);
        this.f44924t1 = c40Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f44924t1.f29682b.invalidate();
    }
}
