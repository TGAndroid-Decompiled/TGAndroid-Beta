package org.telegram.ui.Wallet;
public final class z3 extends bi.l2 {
    public final org.telegram.ui.Cells.t0 E;

    public z3(org.telegram.ui.Cells.t0 t0Var, org.telegram.ui.Cells.t0 t0Var2) {
        super(t0Var);
        this.E = t0Var2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.E.invalidate();
    }
}
