package org.telegram.ui;
public final class cd implements Runnable {
    public final int f32655a;
    public final ld f32656b;

    public cd(ld ldVar, int i10) {
        this.f32655a = i10;
        this.f32656b = ldVar;
    }

    @Override
    public final void run() {
        switch (this.f32655a) {
            case 0:
                ld ldVar = this.f32656b;
                ldVar.f35295j0 = true;
                ldVar.h0();
                return;
            case 1:
                ld ldVar2 = this.f32656b;
                ldVar2.f35312x = null;
                ldVar2.f35313y = null;
                ldVar2.f35297l0 = null;
                ldVar2.m0 = null;
                ldVar2.f35300o0 = null;
                ldVar2.f35299n0 = null;
                ldVar2.f35301p0 = 0.0d;
                ldVar2.e0(false, true);
                ldVar2.e.h(null, null, ldVar2.f35305s, null);
                ldVar2.h.setAnimation(ldVar2.J);
                ldVar2.J.M(0);
                return;
            case 2:
                this.f32656b.g0(true);
                return;
            default:
                ld ldVar3 = this.f32656b;
                ldVar3.f35295j0 = true;
                if (ldVar3.f35310w.length() > 0) {
                    ldVar3.d0(ldVar3.f35310w.getText().toString());
                }
                ldVar3.h0();
                return;
        }
    }
}
