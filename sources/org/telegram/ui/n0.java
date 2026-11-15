package org.telegram.ui;
public final class n0 extends c8.fa {
    public final int f49354a;
    public final g4 f49355b;

    public n0(g4 g4Var, int i7) {
        this.f49354a = i7;
        this.f49355b = g4Var;
    }

    @Override
    public final void a(boolean z10) {
        switch (this.f49354a) {
            case 0:
                if (z10) {
                    this.f49355b.f47324i0.h(false);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.u2 u2Var = this.f49355b.J;
                if (u2Var != null) {
                    u2Var.E0 = z10;
                    return;
                }
                return;
        }
    }

    @Override
    public void b() {
        switch (this.f49354a) {
            case 0:
                if (org.telegram.messenger.g0.H3()) {
                    org.telegram.messenger.i20.s(null, 2131744194, new org.telegram.ui.Components.cc(this.f49355b.f47323h0, null));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
