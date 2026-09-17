package org.telegram.ui;
public final class ed implements Runnable {
    public final int f33364a;
    public final nd f33365b;

    public ed(nd ndVar, int i10) {
        this.f33364a = i10;
        this.f33365b = ndVar;
    }

    @Override
    public final void run() {
        switch (this.f33364a) {
            case 0:
                nd ndVar = this.f33365b;
                ndVar.f36050j0 = true;
                ndVar.h0();
                return;
            case 1:
                nd ndVar2 = this.f33365b;
                ndVar2.f36067x = null;
                ndVar2.f36068y = null;
                ndVar2.f36052l0 = null;
                ndVar2.m0 = null;
                ndVar2.f36055o0 = null;
                ndVar2.f36054n0 = null;
                ndVar2.f36056p0 = 0.0d;
                ndVar2.e0(false, true);
                ndVar2.e.h(null, null, ndVar2.f36060s, null);
                ndVar2.h.setAnimation(ndVar2.J);
                ndVar2.J.M(0);
                return;
            case 2:
                this.f33365b.g0(true);
                return;
            default:
                nd ndVar3 = this.f33365b;
                ndVar3.f36050j0 = true;
                if (ndVar3.f36065w.length() > 0) {
                    ndVar3.d0(ndVar3.f36065w.getText().toString());
                }
                ndVar3.h0();
                return;
        }
    }
}
