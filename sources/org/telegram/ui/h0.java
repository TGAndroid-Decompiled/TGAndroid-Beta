package org.telegram.ui;
public final class h0 extends org.telegram.ui.ActionBar.w4 {
    public final int f48181r;
    public final Object f48182s;

    public h0(Object obj, int i7) {
        this.f48181r = i7;
        this.f48182s = obj;
    }

    @Override
    public void v() {
        switch (this.f48181r) {
            case 1:
                ((org.telegram.ui.Components.yo0) this.f48182s).U1 = true;
                return;
            default:
                return;
        }
    }

    @Override
    public boolean x() {
        boolean z10;
        switch (this.f48181r) {
            case 0:
                g4 g4Var = (g4) this.f48182s;
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
                z10 = ((org.telegram.ui.Wallet.h2) this.f48182s).f44299m;
                break;
            case 3:
                z10 = ((org.telegram.ui.Wallet.y2) this.f48182s).d;
                break;
        }
        return !z10;
    }
}
