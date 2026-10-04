package org.telegram.ui;
public final class ed implements Runnable {
    public final int f35989a;
    public final nd f35990b;

    public ed(nd ndVar, int i10) {
        this.f35989a = i10;
        this.f35990b = ndVar;
    }

    @Override
    public final void run() {
        switch (this.f35989a) {
            case 0:
                nd ndVar = this.f35990b;
                ndVar.f38923j0 = true;
                ndVar.h0();
                return;
            case 1:
                nd ndVar2 = this.f35990b;
                ndVar2.f38940x = null;
                ndVar2.f38941y = null;
                ndVar2.f38925l0 = null;
                ndVar2.m0 = null;
                ndVar2.f38928o0 = null;
                ndVar2.f38927n0 = null;
                ndVar2.f38929p0 = 0.0d;
                ndVar2.e0(false, true);
                ndVar2.f38916e.h(null, null, ndVar2.f38933s, null);
                ndVar2.h.setAnimation(ndVar2.J);
                ndVar2.J.M(0);
                return;
            case 2:
                this.f35990b.g0(true);
                return;
            default:
                nd ndVar3 = this.f35990b;
                ndVar3.f38923j0 = true;
                if (ndVar3.f38938w.length() > 0) {
                    ndVar3.d0(ndVar3.f38938w.getText().toString());
                }
                ndVar3.h0();
                return;
        }
    }
}
