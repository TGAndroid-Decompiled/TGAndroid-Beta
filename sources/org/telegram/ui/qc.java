package org.telegram.ui;
public final class qc implements Runnable {
    public final int f48847a;
    public final ad f48848b;

    public qc(ad adVar, int i3) {
        this.f48847a = i3;
        this.f48848b = adVar;
    }

    @Override
    public final void run() {
        switch (this.f48847a) {
            case 0:
                this.f48848b.m0(true);
                return;
            case 1:
                ad adVar = this.f48848b;
                adVar.f43741l0 = true;
                adVar.n0();
                return;
            case 2:
                ad adVar2 = this.f48848b;
                adVar2.E = null;
                adVar2.F = null;
                adVar2.f43743n0 = null;
                adVar2.f43744o0 = null;
                adVar2.f43746q0 = null;
                adVar2.f43745p0 = null;
                adVar2.f43748r0 = 0.0d;
                adVar2.k0(false, true);
                adVar2.f43734f.j(null, null, adVar2.f43754w, null);
                adVar2.f43742n.setAnimation(adVar2.L);
                adVar2.L.M(0);
                return;
            default:
                ad adVar3 = this.f48848b;
                adVar3.f43741l0 = true;
                if (adVar3.f43758y.length() > 0) {
                    adVar3.j0(adVar3.f43758y.getText().toString());
                }
                adVar3.n0();
                return;
        }
    }
}
