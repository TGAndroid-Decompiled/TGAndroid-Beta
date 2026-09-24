package org.telegram.ui;
public final class cd implements Runnable {
    public final int f32639a;
    public final ld f32640b;

    public cd(ld ldVar, int i10) {
        this.f32639a = i10;
        this.f32640b = ldVar;
    }

    @Override
    public final void run() {
        switch (this.f32639a) {
            case 0:
                ld ldVar = this.f32640b;
                ldVar.f35280j0 = true;
                ldVar.h0();
                return;
            case 1:
                ld ldVar2 = this.f32640b;
                ldVar2.f35297x = null;
                ldVar2.f35298y = null;
                ldVar2.f35282l0 = null;
                ldVar2.m0 = null;
                ldVar2.f35285o0 = null;
                ldVar2.f35284n0 = null;
                ldVar2.f35286p0 = 0.0d;
                ldVar2.e0(false, true);
                ldVar2.e.h(null, null, ldVar2.f35290s, null);
                ldVar2.h.setAnimation(ldVar2.J);
                ldVar2.J.M(0);
                return;
            case 2:
                this.f32640b.g0(true);
                return;
            default:
                ld ldVar3 = this.f32640b;
                ldVar3.f35280j0 = true;
                if (ldVar3.f35295w.length() > 0) {
                    ldVar3.d0(ldVar3.f35295w.getText().toString());
                }
                ldVar3.h0();
                return;
        }
    }
}
