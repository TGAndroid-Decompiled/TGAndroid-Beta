package org.telegram.ui;
public final class dd implements Runnable {
    public final int f33035a;
    public final md f33036b;

    public dd(md mdVar, int i10) {
        this.f33035a = i10;
        this.f33036b = mdVar;
    }

    @Override
    public final void run() {
        switch (this.f33035a) {
            case 0:
                md mdVar = this.f33036b;
                mdVar.f35693j0 = true;
                mdVar.h0();
                return;
            case 1:
                md mdVar2 = this.f33036b;
                mdVar2.f35710x = null;
                mdVar2.f35711y = null;
                mdVar2.f35695l0 = null;
                mdVar2.m0 = null;
                mdVar2.f35698o0 = null;
                mdVar2.f35697n0 = null;
                mdVar2.f35699p0 = 0.0d;
                mdVar2.e0(false, true);
                mdVar2.e.h(null, null, mdVar2.f35703s, null);
                mdVar2.h.setAnimation(mdVar2.J);
                mdVar2.J.M(0);
                return;
            case 2:
                this.f33036b.g0(true);
                return;
            default:
                md mdVar3 = this.f33036b;
                mdVar3.f35693j0 = true;
                if (mdVar3.f35708w.length() > 0) {
                    mdVar3.d0(mdVar3.f35708w.getText().toString());
                }
                mdVar3.h0();
                return;
        }
    }
}
