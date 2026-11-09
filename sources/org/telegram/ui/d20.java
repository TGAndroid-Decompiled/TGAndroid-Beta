package org.telegram.ui;
public final class d20 extends org.telegram.ui.Components.tf0 {
    public final e40 f44804s1;

    public d20(e40 e40Var, LaunchActivity launchActivity, b30 b30Var, m30 m30Var, c20 c20Var) {
        super(launchActivity, b30Var, m30Var, c20Var);
        this.f44804s1 = e40Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f44804s1.f28624b.invalidate();
    }
}
