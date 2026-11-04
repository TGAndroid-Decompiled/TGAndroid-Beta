package org.telegram.ui;
public final class i0 extends org.telegram.ui.ActionBar.u4 {
    public final int f46020r;
    public final Object f46021s;

    public i0(Object obj, int i3) {
        this.f46020r = i3;
        this.f46021s = obj;
    }

    @Override
    public void v() {
        switch (this.f46020r) {
            case 1:
                ((org.telegram.ui.Components.oo0) this.f46021s).R1 = true;
                return;
            default:
                return;
        }
    }

    @Override
    public boolean x() {
        boolean z10;
        switch (this.f46020r) {
            case 0:
                i4 i4Var = (i4) this.f46021s;
                org.telegram.ui.Cells.h9 h9Var = i4Var.R0;
                if (h9Var != null && h9Var.x()) {
                    i4Var.R0.f(false);
                    return false;
                }
                return true;
            case 1:
            default:
                return super.x();
            case 2:
                z10 = ((org.telegram.ui.Wallet.y1) this.f46021s).f43466m;
                break;
            case 3:
                z10 = ((org.telegram.ui.Wallet.s2) this.f46021s).d;
                break;
        }
        return !z10;
    }
}
