package org.telegram.ui;
public final class dd implements Runnable {
    public final int f36930a;
    public final md f36931b;

    public dd(md mdVar, int i10) {
        this.f36930a = i10;
        this.f36931b = mdVar;
    }

    @Override
    public final void run() {
        switch (this.f36930a) {
            case 0:
                md mdVar = this.f36931b;
                mdVar.f39852j0 = true;
                mdVar.h0();
                return;
            case 1:
                md mdVar2 = this.f36931b;
                mdVar2.f39869x = null;
                mdVar2.f39870y = null;
                mdVar2.f39854l0 = null;
                mdVar2.m0 = null;
                mdVar2.f39857o0 = null;
                mdVar2.f39856n0 = null;
                mdVar2.f39858p0 = 0.0d;
                mdVar2.e0(false, true);
                mdVar2.f39845e.h(null, null, mdVar2.f39862s, null);
                mdVar2.h.setAnimation(mdVar2.J);
                mdVar2.J.M(0);
                return;
            case 2:
                this.f36931b.g0(true);
                return;
            default:
                md mdVar3 = this.f36931b;
                mdVar3.f39852j0 = true;
                if (mdVar3.f39867w.length() > 0) {
                    mdVar3.d0(mdVar3.f39867w.getText().toString());
                }
                mdVar3.h0();
                return;
        }
    }
}
