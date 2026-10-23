package org.telegram.ui;
public final class dd implements Runnable {
    public final int f36335a;
    public final md f36336b;

    public dd(md mdVar, int i10) {
        this.f36335a = i10;
        this.f36336b = mdVar;
    }

    @Override
    public final void run() {
        switch (this.f36335a) {
            case 0:
                md mdVar = this.f36336b;
                mdVar.f39195j0 = true;
                mdVar.h0();
                return;
            case 1:
                md mdVar2 = this.f36336b;
                mdVar2.f39212x = null;
                mdVar2.f39213y = null;
                mdVar2.f39197l0 = null;
                mdVar2.m0 = null;
                mdVar2.f39200o0 = null;
                mdVar2.f39199n0 = null;
                mdVar2.f39201p0 = 0.0d;
                mdVar2.e0(false, true);
                mdVar2.e.h(null, null, mdVar2.f39205s, null);
                mdVar2.h.setAnimation(mdVar2.J);
                mdVar2.J.M(0);
                return;
            case 2:
                this.f36336b.g0(true);
                return;
            default:
                md mdVar3 = this.f36336b;
                mdVar3.f39195j0 = true;
                if (mdVar3.f39210w.length() > 0) {
                    mdVar3.d0(mdVar3.f39210w.getText().toString());
                }
                mdVar3.h0();
                return;
        }
    }
}
