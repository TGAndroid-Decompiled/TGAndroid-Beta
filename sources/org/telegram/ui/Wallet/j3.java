package org.telegram.ui.Wallet;
public final class j3 extends yh.j1 {
    public final org.telegram.ui.Cells.w0 f34352y;

    public j3(org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.Cells.w0 w0Var2) {
        super(w0Var);
        this.f34352y = w0Var2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f34352y.invalidate();
    }
}
