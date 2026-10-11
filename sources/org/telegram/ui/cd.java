package org.telegram.ui;
public final class cd implements Runnable {
    public final int f36700a;
    public final ld f36701b;

    public cd(ld ldVar, int i10) {
        this.f36700a = i10;
        this.f36701b = ldVar;
    }

    @Override
    public final void run() {
        switch (this.f36700a) {
            case 0:
                ld ldVar = this.f36701b;
                ldVar.f39640j0 = true;
                ldVar.h0();
                return;
            case 1:
                ld ldVar2 = this.f36701b;
                ldVar2.f39657x = null;
                ldVar2.f39658y = null;
                ldVar2.f39642l0 = null;
                ldVar2.m0 = null;
                ldVar2.f39645o0 = null;
                ldVar2.f39644n0 = null;
                ldVar2.f39646p0 = 0.0d;
                ldVar2.e0(false, true);
                ldVar2.f39633e.h(null, null, ldVar2.f39650s, null);
                ldVar2.h.setAnimation(ldVar2.J);
                ldVar2.J.M(0);
                return;
            case 2:
                this.f36701b.g0(true);
                return;
            default:
                ld ldVar3 = this.f36701b;
                ldVar3.f39640j0 = true;
                if (ldVar3.f39655w.length() > 0) {
                    ldVar3.d0(ldVar3.f39655w.getText().toString());
                }
                ldVar3.h0();
                return;
        }
    }
}
