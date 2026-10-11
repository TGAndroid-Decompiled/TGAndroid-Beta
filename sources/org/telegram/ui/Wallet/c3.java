package org.telegram.ui.Wallet;
public final class c3 extends xh.m1 {
    public final org.telegram.ui.Cells.w0 f34735y;

    public c3(org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.Cells.w0 w0Var2) {
        super(w0Var);
        this.f34735y = w0Var2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f34735y.invalidate();
    }
}
