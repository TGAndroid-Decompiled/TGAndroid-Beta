package org.telegram.ui;
public final class dd implements Runnable {
    public final int f35790a;
    public final md f35791b;

    public dd(md mdVar, int i10) {
        this.f35790a = i10;
        this.f35791b = mdVar;
    }

    @Override
    public final void run() {
        switch (this.f35790a) {
            case 0:
                md mdVar = this.f35791b;
                mdVar.f38675j0 = true;
                mdVar.h0();
                return;
            case 1:
                md mdVar2 = this.f35791b;
                mdVar2.f38692x = null;
                mdVar2.f38693y = null;
                mdVar2.f38677l0 = null;
                mdVar2.m0 = null;
                mdVar2.f38680o0 = null;
                mdVar2.f38679n0 = null;
                mdVar2.f38681p0 = 0.0d;
                mdVar2.e0(false, true);
                mdVar2.f38668e.h(null, null, mdVar2.f38685s, null);
                mdVar2.h.setAnimation(mdVar2.J);
                mdVar2.J.K(0);
                return;
            case 2:
                this.f35791b.g0(true);
                return;
            default:
                md mdVar3 = this.f35791b;
                mdVar3.f38675j0 = true;
                if (mdVar3.f38690w.length() > 0) {
                    mdVar3.d0(mdVar3.f38690w.getText().toString());
                }
                mdVar3.h0();
                return;
        }
    }
}
