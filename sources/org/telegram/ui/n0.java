package org.telegram.ui;
public final class n0 extends c8.ia {
    public final int f50164a;
    public final g4 f50165b;

    public n0(g4 g4Var, int i7) {
        this.f50164a = i7;
        this.f50165b = g4Var;
    }

    @Override
    public final void a(boolean z10) {
        switch (this.f50164a) {
            case 0:
                if (z10) {
                    this.f50165b.f48072i0.h(false);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.w2 w2Var = this.f50165b.J;
                if (w2Var != null) {
                    w2Var.E0 = z10;
                    return;
                }
                return;
        }
    }

    @Override
    public void b() {
        switch (this.f50164a) {
            case 0:
                if (org.telegram.messenger.g0.G3()) {
                    org.telegram.messenger.m10.t(null, 2131743949, new org.telegram.ui.Components.kc(this.f50165b.f48071h0, null));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
