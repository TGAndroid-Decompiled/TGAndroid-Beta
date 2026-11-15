package org.telegram.ui;
public final class h0 extends org.telegram.ui.ActionBar.s4 {
    public final int f47562r;
    public final Object f47563s;

    public h0(Object obj, int i7) {
        this.f47562r = i7;
        this.f47563s = obj;
    }

    @Override
    public void v() {
        switch (this.f47562r) {
            case 1:
                ((org.telegram.ui.Components.po0) this.f47563s).U1 = true;
                return;
            default:
                return;
        }
    }

    @Override
    public boolean x() {
        boolean z10;
        switch (this.f47562r) {
            case 0:
                g4 g4Var = (g4) this.f47563s;
                org.telegram.ui.Cells.h9 h9Var = g4Var.R0;
                if (h9Var != null && h9Var.x()) {
                    g4Var.R0.f(false);
                    return false;
                }
                return true;
            case 1:
            default:
                return super.x();
            case 2:
                z10 = ((org.telegram.ui.Wallet.z1) this.f47563s).f44786m;
                break;
            case 3:
                z10 = ((org.telegram.ui.Wallet.r2) this.f47563s).d;
                break;
        }
        return !z10;
    }
}
