package org.telegram.ui.Wallet;
public final class a3 extends yh.k1 {
    public final org.telegram.ui.Cells.x0 f32921y;

    public a3(org.telegram.ui.Cells.x0 x0Var, org.telegram.ui.Cells.x0 x0Var2) {
        super(x0Var);
        this.f32921y = x0Var2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f32921y.invalidate();
    }
}
