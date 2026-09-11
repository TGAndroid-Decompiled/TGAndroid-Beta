package org.telegram.ui;
public final class dd implements Runnable {
    public final int f35762a;
    public final md f35763b;

    public dd(md mdVar, int i10) {
        this.f35762a = i10;
        this.f35763b = mdVar;
    }

    @Override
    public final void run() {
        switch (this.f35762a) {
            case 0:
                md mdVar = this.f35763b;
                mdVar.f38647j0 = true;
                mdVar.h0();
                return;
            case 1:
                md mdVar2 = this.f35763b;
                mdVar2.f38664x = null;
                mdVar2.f38665y = null;
                mdVar2.f38649l0 = null;
                mdVar2.m0 = null;
                mdVar2.f38652o0 = null;
                mdVar2.f38651n0 = null;
                mdVar2.f38653p0 = 0.0d;
                mdVar2.e0(false, true);
                mdVar2.f38640e.h(null, null, mdVar2.f38657s, null);
                mdVar2.h.setAnimation(mdVar2.J);
                mdVar2.J.K(0);
                return;
            case 2:
                this.f35763b.g0(true);
                return;
            default:
                md mdVar3 = this.f35763b;
                mdVar3.f38647j0 = true;
                if (mdVar3.f38662w.length() > 0) {
                    mdVar3.d0(mdVar3.f38662w.getText().toString());
                }
                mdVar3.h0();
                return;
        }
    }
}
