package org.telegram.ui;
public final class i0 extends org.telegram.ui.ActionBar.k5 {
    public final int f38085r;
    public final Object f38086s;

    public i0(Object obj, int i10) {
        this.f38085r = i10;
        this.f38086s = obj;
    }

    @Override
    public boolean g() {
        switch (this.f38085r) {
            case 0:
                k4 k4Var = (k4) this.f38086s;
                org.telegram.ui.Cells.o9 o9Var = k4Var.Q0;
                if (o9Var != null && o9Var.x()) {
                    k4Var.Q0.f(false);
                    return false;
                }
                return true;
            case 1:
            default:
                return super.g();
            case 2:
                return !((org.telegram.ui.Wallet.a2) this.f38086s).f34283m;
        }
    }

    @Override
    public void onOpenAnimationEnd() {
        switch (this.f38085r) {
            case 1:
                ((org.telegram.ui.Components.hr0) this.f38086s).Z = true;
                return;
            default:
                return;
        }
    }
}
