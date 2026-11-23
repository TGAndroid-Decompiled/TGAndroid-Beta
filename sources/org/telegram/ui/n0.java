package org.telegram.ui;
public final class n0 extends c8.ha {
    public final int f50056a;
    public final g4 f50057b;

    public n0(g4 g4Var, int i7) {
        this.f50056a = i7;
        this.f50057b = g4Var;
    }

    @Override
    public final void a(boolean z10) {
        switch (this.f50056a) {
            case 0:
                if (z10) {
                    this.f50057b.f47961i0.h(false);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.w2 w2Var = this.f50057b.J;
                if (w2Var != null) {
                    w2Var.E0 = z10;
                    return;
                }
                return;
        }
    }

    @Override
    public void b() {
        switch (this.f50056a) {
            case 0:
                if (org.telegram.messenger.g0.G3()) {
                    org.telegram.messenger.o10.t(null, 2131743951, new org.telegram.ui.Components.lc(this.f50057b.f47960h0, null));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
