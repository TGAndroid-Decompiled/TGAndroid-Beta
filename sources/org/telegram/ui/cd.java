package org.telegram.ui;
public final class cd implements Runnable {
    public final int f32654a;
    public final ld f32655b;

    public cd(ld ldVar, int i10) {
        this.f32654a = i10;
        this.f32655b = ldVar;
    }

    @Override
    public final void run() {
        switch (this.f32654a) {
            case 0:
                ld ldVar = this.f32655b;
                ldVar.f35313j0 = true;
                ldVar.h0();
                return;
            case 1:
                ld ldVar2 = this.f32655b;
                ldVar2.f35330x = null;
                ldVar2.f35331y = null;
                ldVar2.f35315l0 = null;
                ldVar2.m0 = null;
                ldVar2.f35318o0 = null;
                ldVar2.f35317n0 = null;
                ldVar2.f35319p0 = 0.0d;
                ldVar2.e0(false, true);
                ldVar2.e.h(null, null, ldVar2.f35323s, null);
                ldVar2.h.setAnimation(ldVar2.J);
                ldVar2.J.M(0);
                return;
            case 2:
                this.f32655b.g0(true);
                return;
            default:
                ld ldVar3 = this.f32655b;
                ldVar3.f35313j0 = true;
                if (ldVar3.f35328w.length() > 0) {
                    ldVar3.d0(ldVar3.f35328w.getText().toString());
                }
                ldVar3.h0();
                return;
        }
    }
}
