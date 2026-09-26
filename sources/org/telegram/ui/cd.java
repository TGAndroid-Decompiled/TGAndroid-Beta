package org.telegram.ui;
public final class cd implements Runnable {
    public final int f32652a;
    public final ld f32653b;

    public cd(ld ldVar, int i10) {
        this.f32652a = i10;
        this.f32653b = ldVar;
    }

    @Override
    public final void run() {
        switch (this.f32652a) {
            case 0:
                ld ldVar = this.f32653b;
                ldVar.f35311j0 = true;
                ldVar.h0();
                return;
            case 1:
                ld ldVar2 = this.f32653b;
                ldVar2.f35328x = null;
                ldVar2.f35329y = null;
                ldVar2.f35313l0 = null;
                ldVar2.m0 = null;
                ldVar2.f35316o0 = null;
                ldVar2.f35315n0 = null;
                ldVar2.f35317p0 = 0.0d;
                ldVar2.e0(false, true);
                ldVar2.e.h(null, null, ldVar2.f35321s, null);
                ldVar2.h.setAnimation(ldVar2.J);
                ldVar2.J.M(0);
                return;
            case 2:
                this.f32653b.g0(true);
                return;
            default:
                ld ldVar3 = this.f32653b;
                ldVar3.f35311j0 = true;
                if (ldVar3.f35326w.length() > 0) {
                    ldVar3.d0(ldVar3.f35326w.getText().toString());
                }
                ldVar3.h0();
                return;
        }
    }
}
