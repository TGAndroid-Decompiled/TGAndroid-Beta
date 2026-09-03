package org.telegram.ui;
public final class gd implements Runnable {
    public final int f34415a;
    public final pd f34416b;

    public gd(pd pdVar, int i10) {
        this.f34415a = i10;
        this.f34416b = pdVar;
    }

    @Override
    public final void run() {
        switch (this.f34415a) {
            case 0:
                pd pdVar = this.f34416b;
                pdVar.f37085g0 = true;
                pdVar.h0();
                return;
            case 1:
                pd pdVar2 = this.f34416b;
                pdVar2.f37102x = null;
                pdVar2.f37103y = null;
                pdVar2.f37087i0 = null;
                pdVar2.f37088j0 = null;
                pdVar2.f37090l0 = null;
                pdVar2.f37089k0 = null;
                pdVar2.m0 = 0.0d;
                pdVar2.e0(false, true);
                pdVar2.e.h(null, null, pdVar2.f37098s, null);
                pdVar2.h.setAnimation(pdVar2.G);
                pdVar2.G.K(0);
                return;
            case 2:
                this.f34416b.g0(true);
                return;
            default:
                pd pdVar3 = this.f34416b;
                pdVar3.f37085g0 = true;
                if (pdVar3.f37101w.length() > 0) {
                    pdVar3.d0(pdVar3.f37101w.getText().toString());
                }
                pdVar3.h0();
                return;
        }
    }
}
