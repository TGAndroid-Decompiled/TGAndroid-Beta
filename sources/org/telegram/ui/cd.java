package org.telegram.ui;
public final class cd implements Runnable {
    public final int f36335a;
    public final md f36336b;

    public cd(md mdVar, int i10) {
        this.f36335a = i10;
        this.f36336b = mdVar;
    }

    @Override
    public final void run() {
        switch (this.f36335a) {
            case 0:
                this.f36336b.h0(true);
                return;
            case 1:
                md mdVar = this.f36336b;
                mdVar.f39488k0 = true;
                mdVar.i0();
                return;
            case 2:
                md mdVar2 = this.f36336b;
                mdVar2.f39506y = null;
                mdVar2.E = null;
                mdVar2.m0 = null;
                mdVar2.f39491n0 = null;
                mdVar2.f39493p0 = null;
                mdVar2.f39492o0 = null;
                mdVar2.f39494q0 = 0.0d;
                mdVar2.f0(false, true);
                mdVar2.f39482f.h(null, null, mdVar2.v, null);
                mdVar2.f39490n.setAnimation(mdVar2.K);
                mdVar2.K.M(0);
                return;
            default:
                md mdVar3 = this.f36336b;
                mdVar3.f39488k0 = true;
                if (mdVar3.f39504x.length() > 0) {
                    mdVar3.e0(mdVar3.f39504x.getText().toString());
                }
                mdVar3.i0();
                return;
        }
    }
}
