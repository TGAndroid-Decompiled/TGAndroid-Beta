package org.telegram.ui;
public final class cd implements Runnable {
    public final int f36666a;
    public final ld f36667b;

    public cd(ld ldVar, int i10) {
        this.f36666a = i10;
        this.f36667b = ldVar;
    }

    @Override
    public final void run() {
        switch (this.f36666a) {
            case 0:
                ld ldVar = this.f36667b;
                ldVar.f39606j0 = true;
                ldVar.h0();
                return;
            case 1:
                ld ldVar2 = this.f36667b;
                ldVar2.f39623x = null;
                ldVar2.f39624y = null;
                ldVar2.f39608l0 = null;
                ldVar2.m0 = null;
                ldVar2.f39611o0 = null;
                ldVar2.f39610n0 = null;
                ldVar2.f39612p0 = 0.0d;
                ldVar2.e0(false, true);
                ldVar2.f39599e.h(null, null, ldVar2.f39616s, null);
                ldVar2.h.setAnimation(ldVar2.J);
                ldVar2.J.M(0);
                return;
            case 2:
                this.f36667b.g0(true);
                return;
            default:
                ld ldVar3 = this.f36667b;
                ldVar3.f39606j0 = true;
                if (ldVar3.f39621w.length() > 0) {
                    ldVar3.d0(ldVar3.f39621w.getText().toString());
                }
                ldVar3.h0();
                return;
        }
    }
}
