package org.telegram.ui;
public final class cd implements Runnable {
    public final int f32751a;
    public final ld f32752b;

    public cd(ld ldVar, int i10) {
        this.f32751a = i10;
        this.f32752b = ldVar;
    }

    @Override
    public final void run() {
        switch (this.f32751a) {
            case 0:
                ld ldVar = this.f32752b;
                ldVar.f35449j0 = true;
                ldVar.h0();
                return;
            case 1:
                ld ldVar2 = this.f32752b;
                ldVar2.f35466x = null;
                ldVar2.f35467y = null;
                ldVar2.f35451l0 = null;
                ldVar2.m0 = null;
                ldVar2.f35454o0 = null;
                ldVar2.f35453n0 = null;
                ldVar2.f35455p0 = 0.0d;
                ldVar2.e0(false, true);
                ldVar2.e.h(null, null, ldVar2.f35459s, null);
                ldVar2.h.setAnimation(ldVar2.J);
                ldVar2.J.M(0);
                return;
            case 2:
                this.f32752b.g0(true);
                return;
            default:
                ld ldVar3 = this.f32752b;
                ldVar3.f35449j0 = true;
                if (ldVar3.f35464w.length() > 0) {
                    ldVar3.d0(ldVar3.f35464w.getText().toString());
                }
                ldVar3.h0();
                return;
        }
    }
}
