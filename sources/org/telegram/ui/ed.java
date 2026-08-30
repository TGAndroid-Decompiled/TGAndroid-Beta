package org.telegram.ui;
public final class ed implements Runnable {
    public final int f33990a;
    public final nd f33991b;

    public ed(nd ndVar, int i10) {
        this.f33990a = i10;
        this.f33991b = ndVar;
    }

    @Override
    public final void run() {
        switch (this.f33990a) {
            case 0:
                nd ndVar = this.f33991b;
                ndVar.f36586g0 = true;
                ndVar.h0();
                return;
            case 1:
                nd ndVar2 = this.f33991b;
                ndVar2.f36603x = null;
                ndVar2.f36604y = null;
                ndVar2.f36588i0 = null;
                ndVar2.f36589j0 = null;
                ndVar2.f36591l0 = null;
                ndVar2.f36590k0 = null;
                ndVar2.m0 = 0.0d;
                ndVar2.e0(false, true);
                ndVar2.e.h(null, null, ndVar2.f36599s, null);
                ndVar2.h.setAnimation(ndVar2.G);
                ndVar2.G.K(0);
                return;
            case 2:
                this.f33991b.g0(true);
                return;
            default:
                nd ndVar3 = this.f33991b;
                ndVar3.f36586g0 = true;
                if (ndVar3.f36602w.length() > 0) {
                    ndVar3.d0(ndVar3.f36602w.getText().toString());
                }
                ndVar3.h0();
                return;
        }
    }
}
