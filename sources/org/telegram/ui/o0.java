package org.telegram.ui;
public final class o0 extends b8.hf {
    public final int f48160a;
    public final i4 f48161b;

    public o0(i4 i4Var, int i3) {
        this.f48160a = i3;
        this.f48161b = i4Var;
    }

    @Override
    public final void a(boolean z10) {
        switch (this.f48160a) {
            case 0:
                if (z10) {
                    this.f48161b.f46088i0.h(false);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.t2 t2Var = this.f48161b.J;
                if (t2Var != null) {
                    t2Var.E0 = z10;
                    return;
                }
                return;
        }
    }

    @Override
    public void b() {
        switch (this.f48160a) {
            case 0:
                if (org.telegram.messenger.g0.I3()) {
                    org.telegram.messenger.camera.q.r(null, 2131744204, new org.telegram.ui.Components.fc(this.f48161b.f46087h0, null));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
