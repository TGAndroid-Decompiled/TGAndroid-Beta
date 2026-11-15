package org.telegram.ui;
public final class n0 extends c8.fa {
    public final int f49353a;
    public final g4 f49354b;

    public n0(g4 g4Var, int i7) {
        this.f49353a = i7;
        this.f49354b = g4Var;
    }

    @Override
    public final void a(boolean z10) {
        switch (this.f49353a) {
            case 0:
                if (z10) {
                    this.f49354b.f47314i0.h(false);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.u2 u2Var = this.f49354b.J;
                if (u2Var != null) {
                    u2Var.E0 = z10;
                    return;
                }
                return;
        }
    }

    @Override
    public void b() {
        switch (this.f49353a) {
            case 0:
                if (org.telegram.messenger.g0.H3()) {
                    org.telegram.messenger.i20.s(null, 2131744194, new org.telegram.ui.Components.cc(this.f49354b.f47313h0, null));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
