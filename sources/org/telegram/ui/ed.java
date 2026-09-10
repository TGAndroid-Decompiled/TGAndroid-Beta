package org.telegram.ui;
public final class ed implements Runnable {
    public final int f32158a;
    public final nd f32159b;

    public ed(nd ndVar, int i10) {
        this.f32158a = i10;
        this.f32159b = ndVar;
    }

    @Override
    public final void run() {
        switch (this.f32158a) {
            case 0:
                nd ndVar = this.f32159b;
                ndVar.f35231j0 = true;
                ndVar.h0();
                return;
            case 1:
                nd ndVar2 = this.f32159b;
                ndVar2.f35248x = null;
                ndVar2.f35249y = null;
                ndVar2.f35233l0 = null;
                ndVar2.m0 = null;
                ndVar2.f35236o0 = null;
                ndVar2.f35235n0 = null;
                ndVar2.f35237p0 = 0.0d;
                ndVar2.e0(false, true);
                ndVar2.e.h(null, null, ndVar2.f35241s, null);
                ndVar2.h.setAnimation(ndVar2.J);
                ndVar2.J.M(0);
                return;
            case 2:
                this.f32159b.g0(true);
                return;
            default:
                nd ndVar3 = this.f32159b;
                ndVar3.f35231j0 = true;
                if (ndVar3.f35246w.length() > 0) {
                    ndVar3.d0(ndVar3.f35246w.getText().toString());
                }
                ndVar3.h0();
                return;
        }
    }
}
