package org.telegram.ui;
public final class h0 extends org.telegram.ui.ActionBar.v4 {
    public final int f48152r;
    public final Object f48153s;

    public h0(Object obj, int i7) {
        this.f48152r = i7;
        this.f48153s = obj;
    }

    @Override
    public void v() {
        switch (this.f48152r) {
            case 1:
                ((org.telegram.ui.Components.ap0) this.f48153s).U1 = true;
                return;
            default:
                return;
        }
    }

    @Override
    public boolean x() {
        boolean z10;
        switch (this.f48152r) {
            case 0:
                g4 g4Var = (g4) this.f48153s;
                org.telegram.ui.Cells.j9 j9Var = g4Var.R0;
                if (j9Var != null && j9Var.x()) {
                    g4Var.R0.f(false);
                    return false;
                }
                return true;
            case 1:
            default:
                return super.x();
            case 2:
                z10 = ((org.telegram.ui.Wallet.h2) this.f48153s).f44309m;
                break;
            case 3:
                z10 = ((org.telegram.ui.Wallet.y2) this.f48153s).d;
                break;
        }
        return !z10;
    }
}
