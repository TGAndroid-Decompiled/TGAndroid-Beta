package org.telegram.ui;
public final class ed implements Runnable {
    public final int f35984a;
    public final nd f35985b;

    public ed(nd ndVar, int i10) {
        this.f35984a = i10;
        this.f35985b = ndVar;
    }

    @Override
    public final void run() {
        switch (this.f35984a) {
            case 0:
                nd ndVar = this.f35985b;
                ndVar.f38918j0 = true;
                ndVar.h0();
                return;
            case 1:
                nd ndVar2 = this.f35985b;
                ndVar2.f38935x = null;
                ndVar2.f38936y = null;
                ndVar2.f38920l0 = null;
                ndVar2.m0 = null;
                ndVar2.f38923o0 = null;
                ndVar2.f38922n0 = null;
                ndVar2.f38924p0 = 0.0d;
                ndVar2.e0(false, true);
                ndVar2.f38911e.h(null, null, ndVar2.f38928s, null);
                ndVar2.h.setAnimation(ndVar2.J);
                ndVar2.J.M(0);
                return;
            case 2:
                this.f35985b.g0(true);
                return;
            default:
                nd ndVar3 = this.f35985b;
                ndVar3.f38918j0 = true;
                if (ndVar3.f38933w.length() > 0) {
                    ndVar3.d0(ndVar3.f38933w.getText().toString());
                }
                ndVar3.h0();
                return;
        }
    }
}
