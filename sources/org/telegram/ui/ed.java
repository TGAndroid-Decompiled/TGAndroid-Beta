package org.telegram.ui;
public final class ed implements Runnable {
    public final int f33368a;
    public final nd f33369b;

    public ed(nd ndVar, int i10) {
        this.f33368a = i10;
        this.f33369b = ndVar;
    }

    @Override
    public final void run() {
        switch (this.f33368a) {
            case 0:
                nd ndVar = this.f33369b;
                ndVar.f36055j0 = true;
                ndVar.h0();
                return;
            case 1:
                nd ndVar2 = this.f33369b;
                ndVar2.f36072x = null;
                ndVar2.f36073y = null;
                ndVar2.f36057l0 = null;
                ndVar2.m0 = null;
                ndVar2.f36060o0 = null;
                ndVar2.f36059n0 = null;
                ndVar2.f36061p0 = 0.0d;
                ndVar2.e0(false, true);
                ndVar2.e.h(null, null, ndVar2.f36065s, null);
                ndVar2.h.setAnimation(ndVar2.J);
                ndVar2.J.M(0);
                return;
            case 2:
                this.f33369b.g0(true);
                return;
            default:
                nd ndVar3 = this.f33369b;
                ndVar3.f36055j0 = true;
                if (ndVar3.f36070w.length() > 0) {
                    ndVar3.d0(ndVar3.f36070w.getText().toString());
                }
                ndVar3.h0();
                return;
        }
    }
}
