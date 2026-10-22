package org.telegram.ui;
public final class dd implements Runnable {
    public final int f36334a;
    public final md f36335b;

    public dd(md mdVar, int i10) {
        this.f36334a = i10;
        this.f36335b = mdVar;
    }

    @Override
    public final void run() {
        switch (this.f36334a) {
            case 0:
                md mdVar = this.f36335b;
                mdVar.f39194j0 = true;
                mdVar.h0();
                return;
            case 1:
                md mdVar2 = this.f36335b;
                mdVar2.f39211x = null;
                mdVar2.f39212y = null;
                mdVar2.f39196l0 = null;
                mdVar2.m0 = null;
                mdVar2.f39199o0 = null;
                mdVar2.f39198n0 = null;
                mdVar2.f39200p0 = 0.0d;
                mdVar2.e0(false, true);
                mdVar2.e.h(null, null, mdVar2.f39204s, null);
                mdVar2.h.setAnimation(mdVar2.J);
                mdVar2.J.M(0);
                return;
            case 2:
                this.f36335b.g0(true);
                return;
            default:
                md mdVar3 = this.f36335b;
                mdVar3.f39194j0 = true;
                if (mdVar3.f39209w.length() > 0) {
                    mdVar3.d0(mdVar3.f39209w.getText().toString());
                }
                mdVar3.h0();
                return;
        }
    }
}
