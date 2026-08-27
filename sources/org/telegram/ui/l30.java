package org.telegram.ui;

public final class l30 extends org.telegram.ui.Components.ch0 {

    public final s50 f39932o1;

    public l30(s50 s50Var, LaunchActivity launchActivity, o40 o40Var, y40 y40Var, k30 k30Var) {
        super(launchActivity, o40Var, y40Var, k30Var);
        this.f39932o1 = s50Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        ((org.telegram.ui.ActionBar.e3) this.f39932o1).containerView.invalidate();
    }
}
