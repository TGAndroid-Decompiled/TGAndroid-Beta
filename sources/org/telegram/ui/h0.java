package org.telegram.ui;
public final class h0 extends org.telegram.ui.ActionBar.u4 {
    public final int f46155r;
    public final Object f46156s;

    public h0(Object obj, int i7) {
        this.f46155r = i7;
        this.f46156s = obj;
    }

    @Override
    public void v() {
        switch (this.f46155r) {
            case 1:
                ((org.telegram.ui.Components.mo0) this.f46156s).Q1 = true;
                return;
            default:
                return;
        }
    }

    @Override
    public boolean x() {
        boolean z9;
        switch (this.f46155r) {
            case 0:
                g4 g4Var = (g4) this.f46156s;
                org.telegram.ui.Cells.i9 i9Var = g4Var.Q0;
                if (i9Var != null && i9Var.x()) {
                    g4Var.Q0.f(false);
                    return false;
                }
                return true;
            case 1:
            default:
                return super.x();
            case 2:
                z9 = ((org.telegram.ui.Wallet.b2) this.f46156s).f42107m;
                break;
            case 3:
                z9 = ((org.telegram.ui.Wallet.u2) this.f46156s).d;
                break;
        }
        return !z9;
    }
}
