package org.telegram.ui.Wallet;
public final class c3 extends xh.m1 {
    public final org.telegram.ui.Cells.w0 f34769y;

    public c3(org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.Cells.w0 w0Var2) {
        super(w0Var);
        this.f34769y = w0Var2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f34769y.invalidate();
    }
}
