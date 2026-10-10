package org.telegram.ui.Wallet;
public final class b3 extends xh.m1 {
    public final org.telegram.ui.Cells.w0 f34704y;

    public b3(org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.Cells.w0 w0Var2) {
        super(w0Var);
        this.f34704y = w0Var2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f34704y.invalidate();
    }
}
