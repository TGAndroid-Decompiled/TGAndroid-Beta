package org.telegram.ui.Wallet;
public final class z2 extends xh.m1 {
    public final org.telegram.ui.Cells.w0 f35709y;

    public z2(org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.Cells.w0 w0Var2) {
        super(w0Var);
        this.f35709y = w0Var2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f35709y.invalidate();
    }
}
