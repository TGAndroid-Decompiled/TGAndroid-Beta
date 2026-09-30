package org.telegram.ui;
public final class cd implements Runnable {
    public final int f32741a;
    public final ld f32742b;

    public cd(ld ldVar, int i10) {
        this.f32741a = i10;
        this.f32742b = ldVar;
    }

    @Override
    public final void run() {
        switch (this.f32741a) {
            case 0:
                ld ldVar = this.f32742b;
                ldVar.f35403j0 = true;
                ldVar.h0();
                return;
            case 1:
                ld ldVar2 = this.f32742b;
                ldVar2.f35420x = null;
                ldVar2.f35421y = null;
                ldVar2.f35405l0 = null;
                ldVar2.m0 = null;
                ldVar2.f35408o0 = null;
                ldVar2.f35407n0 = null;
                ldVar2.f35409p0 = 0.0d;
                ldVar2.e0(false, true);
                ldVar2.e.h(null, null, ldVar2.f35413s, null);
                ldVar2.h.setAnimation(ldVar2.J);
                ldVar2.J.M(0);
                return;
            case 2:
                this.f32742b.g0(true);
                return;
            default:
                ld ldVar3 = this.f32742b;
                ldVar3.f35403j0 = true;
                if (ldVar3.f35418w.length() > 0) {
                    ldVar3.d0(ldVar3.f35418w.getText().toString());
                }
                ldVar3.h0();
                return;
        }
    }
}
