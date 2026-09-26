package org.telegram.ui;
public final class cd implements Runnable {
    public final int f32653a;
    public final ld f32654b;

    public cd(ld ldVar, int i10) {
        this.f32653a = i10;
        this.f32654b = ldVar;
    }

    @Override
    public final void run() {
        switch (this.f32653a) {
            case 0:
                ld ldVar = this.f32654b;
                ldVar.f35312j0 = true;
                ldVar.h0();
                return;
            case 1:
                ld ldVar2 = this.f32654b;
                ldVar2.f35329x = null;
                ldVar2.f35330y = null;
                ldVar2.f35314l0 = null;
                ldVar2.m0 = null;
                ldVar2.f35317o0 = null;
                ldVar2.f35316n0 = null;
                ldVar2.f35318p0 = 0.0d;
                ldVar2.e0(false, true);
                ldVar2.e.h(null, null, ldVar2.f35322s, null);
                ldVar2.h.setAnimation(ldVar2.J);
                ldVar2.J.M(0);
                return;
            case 2:
                this.f32654b.g0(true);
                return;
            default:
                ld ldVar3 = this.f32654b;
                ldVar3.f35312j0 = true;
                if (ldVar3.f35327w.length() > 0) {
                    ldVar3.d0(ldVar3.f35327w.getText().toString());
                }
                ldVar3.h0();
                return;
        }
    }
}
