package org.telegram.ui;
public final class b20 extends org.telegram.ui.Components.sf0 {
    public final c40 f44164s1;

    public b20(c40 c40Var, LaunchActivity launchActivity, z20 z20Var, k30 k30Var, a20 a20Var) {
        super(launchActivity, z20Var, k30Var, a20Var);
        this.f44164s1 = c40Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f44164s1.f28619b.invalidate();
    }
}
