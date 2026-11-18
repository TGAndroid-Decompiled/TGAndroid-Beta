package org.telegram.ui.Wallet;
public final class j4 extends bi.f3 {
    public final org.telegram.ui.Cells.v0 E;

    public j4(org.telegram.ui.Cells.v0 v0Var, org.telegram.ui.Cells.v0 v0Var2) {
        super(v0Var, 1.0f);
        this.E = v0Var2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.E.invalidate();
    }
}
