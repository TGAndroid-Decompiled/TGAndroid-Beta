package org.telegram.ui;
public final class p0 extends w7.x5 {
    public final int f40314a;
    public final h4 f40315b;

    public p0(h4 h4Var, int i10) {
        this.f40314a = i10;
        this.f40315b = h4Var;
    }

    @Override
    public final void a(boolean z10) {
        switch (this.f40314a) {
            case 0:
                if (z10) {
                    this.f40315b.f37679h0.h(false);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.z2 z2Var = this.f40315b.I;
                if (z2Var != null) {
                    z2Var.D0 = z10;
                    return;
                }
                return;
        }
    }

    @Override
    public void b() {
        switch (this.f40314a) {
            case 0:
                if (org.telegram.messenger.i0.H3()) {
                    org.telegram.messenger.a30.r(null, 2131744219, new org.telegram.ui.Components.cc(this.f40315b.f37678g0, null));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
