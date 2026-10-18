package org.telegram.ui.Wallet;
public final class i3 extends yh.k1 {
    public final org.telegram.ui.Cells.w0 f34328y;

    public i3(org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.Cells.w0 w0Var2) {
        super(w0Var);
        this.f34328y = w0Var2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f34328y.invalidate();
    }
}
