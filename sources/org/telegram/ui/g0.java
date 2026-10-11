package org.telegram.ui;
public final class g0 extends org.telegram.ui.ActionBar.e5 {
    public final int f37851f;
    public final Object h;

    public g0(Object obj, int i10) {
        this.f37851f = i10;
        this.h = obj;
    }

    @Override
    public boolean h() {
        switch (this.f37851f) {
            case 0:
                h4 h4Var = (h4) this.h;
                org.telegram.ui.Cells.o9 o9Var = h4Var.P0;
                if (o9Var != null && o9Var.x()) {
                    h4Var.P0.f(false);
                    return false;
                }
                return true;
            case 1:
            default:
                return super.h();
            case 2:
                return !((org.telegram.ui.Wallet.b2) this.h).f34720m;
        }
    }

    @Override
    public void onOpenAnimationEnd() {
        switch (this.f37851f) {
            case 1:
                ((org.telegram.ui.Components.nr0) this.h).Y = true;
                return;
            default:
                return;
        }
    }
}
