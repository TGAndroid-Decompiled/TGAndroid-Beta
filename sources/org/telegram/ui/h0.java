package org.telegram.ui;
public final class h0 extends org.telegram.ui.ActionBar.g5 {
    public final int f38162f;
    public final Object h;

    public h0(Object obj, int i10) {
        this.f38162f = i10;
        this.h = obj;
    }

    @Override
    public boolean h() {
        switch (this.f38162f) {
            case 0:
                i4 i4Var = (i4) this.h;
                org.telegram.ui.Cells.o9 o9Var = i4Var.P0;
                if (o9Var != null && o9Var.x()) {
                    i4Var.P0.f(false);
                    return false;
                }
                return true;
            case 1:
            default:
                return super.h();
            case 2:
                return !((org.telegram.ui.Wallet.z1) this.h).f35703m;
        }
    }

    @Override
    public void onOpenAnimationEnd() {
        switch (this.f38162f) {
            case 1:
                ((org.telegram.ui.Components.mr0) this.h).Y = true;
                return;
            default:
                return;
        }
    }
}
