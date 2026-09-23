package org.telegram.ui;
public final class cd implements Runnable {
    public final int f32311a;
    public final ld f32312b;

    public cd(ld ldVar, int i10) {
        this.f32311a = i10;
        this.f32312b = ldVar;
    }

    @Override
    public final void run() {
        switch (this.f32311a) {
            case 0:
                ld ldVar = this.f32312b;
                ldVar.f34928j0 = true;
                ldVar.h0();
                return;
            case 1:
                ld ldVar2 = this.f32312b;
                ldVar2.f34945x = null;
                ldVar2.f34946y = null;
                ldVar2.f34930l0 = null;
                ldVar2.m0 = null;
                ldVar2.f34933o0 = null;
                ldVar2.f34932n0 = null;
                ldVar2.f34934p0 = 0.0d;
                ldVar2.e0(false, true);
                ldVar2.e.h(null, null, ldVar2.f34938s, null);
                ldVar2.h.setAnimation(ldVar2.J);
                ldVar2.J.M(0);
                return;
            case 2:
                this.f32312b.g0(true);
                return;
            default:
                ld ldVar3 = this.f32312b;
                ldVar3.f34928j0 = true;
                if (ldVar3.f34943w.length() > 0) {
                    ldVar3.d0(ldVar3.f34943w.getText().toString());
                }
                ldVar3.h0();
                return;
        }
    }
}
