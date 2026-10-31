package org.telegram.ui.Wallet;
public final class a4 extends ph.f1 {
    public final org.telegram.ui.Cells.s0 D;

    public a4(org.telegram.ui.Cells.s0 s0Var, org.telegram.ui.Cells.s0 s0Var2) {
        super(s0Var);
        this.D = s0Var2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.D.invalidate();
    }
}
