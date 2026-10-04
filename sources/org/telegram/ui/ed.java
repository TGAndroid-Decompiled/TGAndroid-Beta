package org.telegram.ui;
public final class ed implements Runnable {
    public final int f35983a;
    public final nd f35984b;

    public ed(nd ndVar, int i10) {
        this.f35983a = i10;
        this.f35984b = ndVar;
    }

    @Override
    public final void run() {
        switch (this.f35983a) {
            case 0:
                nd ndVar = this.f35984b;
                ndVar.f38917j0 = true;
                ndVar.h0();
                return;
            case 1:
                nd ndVar2 = this.f35984b;
                ndVar2.f38934x = null;
                ndVar2.f38935y = null;
                ndVar2.f38919l0 = null;
                ndVar2.m0 = null;
                ndVar2.f38922o0 = null;
                ndVar2.f38921n0 = null;
                ndVar2.f38923p0 = 0.0d;
                ndVar2.e0(false, true);
                ndVar2.f38910e.h(null, null, ndVar2.f38927s, null);
                ndVar2.h.setAnimation(ndVar2.J);
                ndVar2.J.M(0);
                return;
            case 2:
                this.f35984b.g0(true);
                return;
            default:
                nd ndVar3 = this.f35984b;
                ndVar3.f38917j0 = true;
                if (ndVar3.f38932w.length() > 0) {
                    ndVar3.d0(ndVar3.f38932w.getText().toString());
                }
                ndVar3.h0();
                return;
        }
    }
}
