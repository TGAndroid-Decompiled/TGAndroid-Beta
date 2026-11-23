package org.telegram.ui;
public final class d20 extends org.telegram.ui.Components.hg0 {
    public final f40 f46827t1;

    public d20(f40 f40Var, LaunchActivity launchActivity, d30 d30Var, n30 n30Var, c20 c20Var) {
        super(launchActivity, d30Var, n30Var, c20Var);
        this.f46827t1 = f40Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f46827t1.f30142b.invalidate();
    }
}
