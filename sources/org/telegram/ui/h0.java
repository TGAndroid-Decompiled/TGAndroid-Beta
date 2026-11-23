package org.telegram.ui;
public final class h0 extends org.telegram.ui.ActionBar.v4 {
    public final int f48385r;
    public final Object f48386s;

    public h0(Object obj, int i7) {
        this.f48385r = i7;
        this.f48386s = obj;
    }

    @Override
    public void v() {
        switch (this.f48385r) {
            case 1:
                ((org.telegram.ui.Components.zo0) this.f48386s).U1 = true;
                return;
            default:
                return;
        }
    }

    @Override
    public boolean x() {
        boolean z10;
        switch (this.f48385r) {
            case 0:
                g4 g4Var = (g4) this.f48386s;
                org.telegram.ui.Cells.i9 i9Var = g4Var.R0;
                if (i9Var != null && i9Var.x()) {
                    g4Var.R0.f(false);
                    return false;
                }
                return true;
            case 1:
            default:
                return super.x();
            case 2:
                z10 = ((org.telegram.ui.Wallet.i2) this.f48386s).f44471m;
                break;
            case 3:
                z10 = ((org.telegram.ui.Wallet.z2) this.f48386s).d;
                break;
        }
        return !z10;
    }
}
