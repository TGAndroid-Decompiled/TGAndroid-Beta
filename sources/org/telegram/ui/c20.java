package org.telegram.ui;
public final class c20 extends org.telegram.ui.Components.gg0 {
    public final e40 f46697t1;

    public c20(e40 e40Var, LaunchActivity launchActivity, c30 c30Var, m30 m30Var, b20 b20Var) {
        super(launchActivity, c30Var, m30Var, b20Var);
        this.f46697t1 = e40Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f46697t1.f30226b.invalidate();
    }
}
