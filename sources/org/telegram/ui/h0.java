package org.telegram.ui;
public final class h0 extends org.telegram.ui.ActionBar.m5 {
    public final int f39735r;
    public final Object f39736s;

    public h0(Object obj, int i10) {
        this.f39735r = i10;
        this.f39736s = obj;
    }

    @Override
    public boolean g() {
        switch (this.f39735r) {
            case 0:
                j4 j4Var = (j4) this.f39736s;
                org.telegram.ui.Cells.s9 s9Var = j4Var.Q0;
                if (s9Var != null && s9Var.x()) {
                    j4Var.Q0.f(false);
                    return false;
                }
                return true;
            case 1:
            default:
                return super.g();
            case 2:
                return !((org.telegram.ui.Wallet.a2) this.f39736s).f36370m;
        }
    }

    @Override
    public void onOpenAnimationEnd() {
        switch (this.f39735r) {
            case 1:
                ((org.telegram.ui.Components.nr0) this.f39736s).Z = true;
                return;
            default:
                return;
        }
    }
}
