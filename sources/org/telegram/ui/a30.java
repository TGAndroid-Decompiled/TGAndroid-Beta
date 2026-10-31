package org.telegram.ui;
public final class a30 extends org.telegram.ui.Components.ug0 {
    public final b50 f35539s1;

    public a30(b50 b50Var, LaunchActivity launchActivity, y30 y30Var, i40 i40Var, z20 z20Var) {
        super(launchActivity, y30Var, i40Var, z20Var);
        this.f35539s1 = b50Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f35539s1.f21586b.invalidate();
    }
}
