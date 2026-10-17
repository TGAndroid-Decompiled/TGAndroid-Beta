package org.telegram.ui;
public final class j0 extends org.telegram.ui.ActionBar.g5 {
    public final int f38001r;
    public final Object f38002s;

    public j0(Object obj, int i10) {
        this.f38001r = i10;
        this.f38002s = obj;
    }

    @Override
    public boolean h() {
        switch (this.f38001r) {
            case 0:
                l4 l4Var = (l4) this.f38002s;
                org.telegram.ui.Cells.n9 n9Var = l4Var.P0;
                if (n9Var != null && n9Var.x()) {
                    l4Var.P0.f(false);
                    return false;
                }
                return true;
            case 1:
            default:
                return super.h();
            case 2:
                return !((org.telegram.ui.Wallet.b2) this.f38002s).f34028m;
        }
    }

    @Override
    public void onOpenAnimationEnd() {
        switch (this.f38001r) {
            case 1:
                ((org.telegram.ui.Components.dr0) this.f38002s).Y = true;
                return;
            default:
                return;
        }
    }
}
