package org.telegram.ui;
public final class cd implements Runnable {
    public final int f36307a;
    public final md f36308b;

    public cd(md mdVar, int i10) {
        this.f36307a = i10;
        this.f36308b = mdVar;
    }

    @Override
    public final void run() {
        switch (this.f36307a) {
            case 0:
                this.f36308b.h0(true);
                return;
            case 1:
                md mdVar = this.f36308b;
                mdVar.f39548k0 = true;
                mdVar.i0();
                return;
            case 2:
                md mdVar2 = this.f36308b;
                mdVar2.f39566y = null;
                mdVar2.E = null;
                mdVar2.m0 = null;
                mdVar2.f39551n0 = null;
                mdVar2.f39553p0 = null;
                mdVar2.f39552o0 = null;
                mdVar2.f39554q0 = 0.0d;
                mdVar2.f0(false, true);
                mdVar2.f39542f.h(null, null, mdVar2.v, null);
                mdVar2.f39550n.setAnimation(mdVar2.K);
                mdVar2.K.M(0);
                return;
            default:
                md mdVar3 = this.f36308b;
                mdVar3.f39548k0 = true;
                if (mdVar3.f39564x.length() > 0) {
                    mdVar3.e0(mdVar3.f39564x.getText().toString());
                }
                mdVar3.i0();
                return;
        }
    }
}
