package org.telegram.ui;
public final class n0 extends c8.da {
    public final int f47899a;
    public final g4 f47900b;

    public n0(g4 g4Var, int i7) {
        this.f47899a = i7;
        this.f47900b = g4Var;
    }

    @Override
    public final void a(boolean z9) {
        switch (this.f47899a) {
            case 0:
                if (z9) {
                    this.f47900b.f45804h0.h(false);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.v2 v2Var = this.f47900b.I;
                if (v2Var != null) {
                    v2Var.D0 = z9;
                    return;
                }
                return;
        }
    }

    @Override
    public void b() {
        switch (this.f47899a) {
            case 0:
                if (org.telegram.messenger.g0.I3()) {
                    org.telegram.messenger.camera.q.r(null, 2131744195, new org.telegram.ui.Components.hc(this.f47900b.f45803g0, null));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
