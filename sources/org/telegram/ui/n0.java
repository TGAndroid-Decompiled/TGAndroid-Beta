package org.telegram.ui;
public final class n0 extends c8.da {
    public final int f48086a;
    public final g4 f48087b;

    public n0(g4 g4Var, int i7) {
        this.f48086a = i7;
        this.f48087b = g4Var;
    }

    @Override
    public final void a(boolean z9) {
        switch (this.f48086a) {
            case 0:
                if (z9) {
                    this.f48087b.f45959h0.h(false);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.w2 w2Var = this.f48087b.I;
                if (w2Var != null) {
                    w2Var.D0 = z9;
                    return;
                }
                return;
        }
    }

    @Override
    public void b() {
        switch (this.f48086a) {
            case 0:
                if (org.telegram.messenger.g0.I3()) {
                    org.telegram.messenger.camera.q.r(null, 2131744194, new org.telegram.ui.Components.gc(this.f48087b.f45958g0, null));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
