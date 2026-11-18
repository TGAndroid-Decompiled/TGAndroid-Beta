package org.telegram.ui;
public final class n0 extends c8.ha {
    public final int f50045a;
    public final g4 f50046b;

    public n0(g4 g4Var, int i7) {
        this.f50045a = i7;
        this.f50046b = g4Var;
    }

    @Override
    public final void a(boolean z10) {
        switch (this.f50045a) {
            case 0:
                if (z10) {
                    this.f50046b.f47923i0.h(false);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.x2 x2Var = this.f50046b.J;
                if (x2Var != null) {
                    x2Var.E0 = z10;
                    return;
                }
                return;
        }
    }

    @Override
    public void b() {
        switch (this.f50045a) {
            case 0:
                if (org.telegram.messenger.g0.G3()) {
                    org.telegram.messenger.n10.t(null, 2131743959, new org.telegram.ui.Components.lc(this.f50046b.f47922h0, null));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
