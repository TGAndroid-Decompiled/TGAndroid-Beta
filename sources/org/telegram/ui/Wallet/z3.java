package org.telegram.ui.Wallet;
public final class z3 extends zh.b1 {
    public final org.telegram.ui.Cells.t0 D;

    public z3(org.telegram.ui.Cells.t0 t0Var, org.telegram.ui.Cells.t0 t0Var2) {
        super(t0Var);
        this.D = t0Var2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.D.invalidate();
    }
}
