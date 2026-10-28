package org.telegram.ui.Wallet;
public final class j3 extends zh.j1 {
    public final org.telegram.ui.Cells.v0 f36757y;

    public j3(org.telegram.ui.Cells.v0 v0Var, org.telegram.ui.Cells.v0 v0Var2) {
        super(v0Var);
        this.f36757y = v0Var2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f36757y.invalidate();
    }
}
