package org.telegram.ui;
public final class h0 extends org.telegram.ui.ActionBar.u4 {
    public final int f46176r;
    public final Object f46177s;

    public h0(Object obj, int i7) {
        this.f46176r = i7;
        this.f46177s = obj;
    }

    @Override
    public void v() {
        switch (this.f46176r) {
            case 1:
                ((org.telegram.ui.Components.mo0) this.f46177s).Q1 = true;
                return;
            default:
                return;
        }
    }

    @Override
    public boolean x() {
        boolean z9;
        switch (this.f46176r) {
            case 0:
                g4 g4Var = (g4) this.f46177s;
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
                z9 = ((org.telegram.ui.Wallet.a2) this.f46177s).f42103m;
                break;
            case 3:
                z9 = ((org.telegram.ui.Wallet.t2) this.f46177s).d;
                break;
        }
        return !z9;
    }
}
