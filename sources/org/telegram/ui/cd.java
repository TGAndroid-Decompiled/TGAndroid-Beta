package org.telegram.ui;
public final class cd implements Runnable {
    public final int f32754a;
    public final ld f32755b;

    public cd(ld ldVar, int i10) {
        this.f32754a = i10;
        this.f32755b = ldVar;
    }

    @Override
    public final void run() {
        switch (this.f32754a) {
            case 0:
                ld ldVar = this.f32755b;
                ldVar.f35420j0 = true;
                ldVar.h0();
                return;
            case 1:
                ld ldVar2 = this.f32755b;
                ldVar2.f35437x = null;
                ldVar2.f35438y = null;
                ldVar2.f35422l0 = null;
                ldVar2.m0 = null;
                ldVar2.f35425o0 = null;
                ldVar2.f35424n0 = null;
                ldVar2.f35426p0 = 0.0d;
                ldVar2.e0(false, true);
                ldVar2.e.h(null, null, ldVar2.f35430s, null);
                ldVar2.h.setAnimation(ldVar2.J);
                ldVar2.J.M(0);
                return;
            case 2:
                this.f32755b.g0(true);
                return;
            default:
                ld ldVar3 = this.f32755b;
                ldVar3.f35420j0 = true;
                if (ldVar3.f35435w.length() > 0) {
                    ldVar3.d0(ldVar3.f35435w.getText().toString());
                }
                ldVar3.h0();
                return;
        }
    }
}
