package org.telegram.ui;
public final class e20 extends org.telegram.ui.Components.sf0 {
    public final f40 f45107s1;

    public e20(f40 f40Var, LaunchActivity launchActivity, c30 c30Var, n30 n30Var, d20 d20Var) {
        super(launchActivity, c30Var, n30Var, d20Var);
        this.f45107s1 = f40Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f45107s1.f28672b.invalidate();
    }
}
