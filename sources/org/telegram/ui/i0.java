package org.telegram.ui;
public final class i0 extends org.telegram.ui.ActionBar.e5 {
    public final int f36999f;
    public final Object h;

    public i0(Object obj, int i10) {
        this.f36999f = i10;
        this.h = obj;
    }

    @Override
    public boolean h() {
        switch (this.f36999f) {
            case 0:
                k4 k4Var = (k4) this.h;
                org.telegram.ui.Cells.o9 o9Var = k4Var.P0;
                if (o9Var != null && o9Var.x()) {
                    k4Var.P0.f(false);
                    return false;
                }
                return true;
            case 1:
            default:
                return super.h();
            case 2:
                return !((org.telegram.ui.Wallet.z1) this.h).f33909m;
        }
    }

    @Override
    public void onOpenAnimationEnd() {
        switch (this.f36999f) {
            case 1:
                ((org.telegram.ui.Components.jr0) this.h).Y = true;
                return;
            default:
                return;
        }
    }
}
