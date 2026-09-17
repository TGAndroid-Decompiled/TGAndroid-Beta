package org.telegram.ui;
public final class dd implements Runnable {
    public final int f35763a;
    public final md f35764b;

    public dd(md mdVar, int i10) {
        this.f35763a = i10;
        this.f35764b = mdVar;
    }

    @Override
    public final void run() {
        switch (this.f35763a) {
            case 0:
                md mdVar = this.f35764b;
                mdVar.f38648j0 = true;
                mdVar.h0();
                return;
            case 1:
                md mdVar2 = this.f35764b;
                mdVar2.f38665x = null;
                mdVar2.f38666y = null;
                mdVar2.f38650l0 = null;
                mdVar2.m0 = null;
                mdVar2.f38653o0 = null;
                mdVar2.f38652n0 = null;
                mdVar2.f38654p0 = 0.0d;
                mdVar2.e0(false, true);
                mdVar2.f38641e.h(null, null, mdVar2.f38658s, null);
                mdVar2.h.setAnimation(mdVar2.J);
                mdVar2.J.K(0);
                return;
            case 2:
                this.f35764b.g0(true);
                return;
            default:
                md mdVar3 = this.f35764b;
                mdVar3.f38648j0 = true;
                if (mdVar3.f38663w.length() > 0) {
                    mdVar3.d0(mdVar3.f38663w.getText().toString());
                }
                mdVar3.h0();
                return;
        }
    }
}
