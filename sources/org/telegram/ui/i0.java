package org.telegram.ui;
public final class i0 extends org.telegram.ui.ActionBar.d5 {
    public final int f38064r;
    public final Object f38065s;

    public i0(Object obj, int i10) {
        this.f38064r = i10;
        this.f38065s = obj;
    }

    @Override
    public void w() {
        switch (this.f38064r) {
            case 1:
                ((org.telegram.ui.Components.op0) this.f38065s).Q1 = true;
                return;
            default:
                return;
        }
    }

    @Override
    public boolean y() {
        boolean z10;
        switch (this.f38064r) {
            case 0:
                h4 h4Var = (h4) this.f38065s;
                org.telegram.ui.Cells.k9 k9Var = h4Var.Q0;
                if (k9Var != null && k9Var.x()) {
                    h4Var.Q0.f(false);
                    return false;
                }
                return true;
            case 1:
            default:
                return super.y();
            case 2:
                z10 = ((org.telegram.ui.Wallet.a2) this.f38065s).f34171m;
                break;
            case 3:
                z10 = ((org.telegram.ui.Wallet.t2) this.f38065s).d;
                break;
        }
        return !z10;
    }
}
