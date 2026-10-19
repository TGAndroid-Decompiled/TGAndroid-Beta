package org.telegram.ui;
public final class dd implements Runnable {
    public final int f36324a;
    public final md f36325b;

    public dd(md mdVar, int i10) {
        this.f36324a = i10;
        this.f36325b = mdVar;
    }

    @Override
    public final void run() {
        switch (this.f36324a) {
            case 0:
                md mdVar = this.f36325b;
                mdVar.f39184j0 = true;
                mdVar.h0();
                return;
            case 1:
                md mdVar2 = this.f36325b;
                mdVar2.f39201x = null;
                mdVar2.f39202y = null;
                mdVar2.f39186l0 = null;
                mdVar2.m0 = null;
                mdVar2.f39189o0 = null;
                mdVar2.f39188n0 = null;
                mdVar2.f39190p0 = 0.0d;
                mdVar2.e0(false, true);
                mdVar2.e.h(null, null, mdVar2.f39194s, null);
                mdVar2.h.setAnimation(mdVar2.J);
                mdVar2.J.M(0);
                return;
            case 2:
                this.f36325b.g0(true);
                return;
            default:
                md mdVar3 = this.f36325b;
                mdVar3.f39184j0 = true;
                if (mdVar3.f39199w.length() > 0) {
                    mdVar3.d0(mdVar3.f39199w.getText().toString());
                }
                mdVar3.h0();
                return;
        }
    }
}
