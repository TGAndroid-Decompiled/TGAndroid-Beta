package org.telegram.ui;
public final class i0 extends org.telegram.ui.ActionBar.d5 {
    public final int f37907r;
    public final Object f37908s;

    public i0(Object obj, int i10) {
        this.f37907r = i10;
        this.f37908s = obj;
    }

    @Override
    public void w() {
        switch (this.f37907r) {
            case 1:
                ((org.telegram.ui.Components.pp0) this.f37908s).Q1 = true;
                return;
            default:
                return;
        }
    }

    @Override
    public boolean y() {
        boolean z10;
        switch (this.f37907r) {
            case 0:
                h4 h4Var = (h4) this.f37908s;
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
                z10 = ((org.telegram.ui.Wallet.a2) this.f37908s).f34178m;
                break;
            case 3:
                z10 = ((org.telegram.ui.Wallet.u2) this.f37908s).d;
                break;
        }
        return !z10;
    }
}
