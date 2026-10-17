package org.telegram.ui.Wallet;
public final class h3 extends yh.k1 {
    public final org.telegram.ui.Cells.x0 f34257y;

    public h3(org.telegram.ui.Cells.x0 x0Var, org.telegram.ui.Cells.x0 x0Var2) {
        super(x0Var);
        this.f34257y = x0Var2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f34257y.invalidate();
    }
}
