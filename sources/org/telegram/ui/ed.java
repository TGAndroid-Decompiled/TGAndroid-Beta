package org.telegram.ui;
public final class ed implements Runnable {
    public final int f36479a;
    public final nd f36480b;

    public ed(nd ndVar, int i10) {
        this.f36479a = i10;
        this.f36480b = ndVar;
    }

    @Override
    public final void run() {
        switch (this.f36479a) {
            case 0:
                nd ndVar = this.f36480b;
                ndVar.f39394g0 = true;
                ndVar.h0();
                return;
            case 1:
                nd ndVar2 = this.f36480b;
                ndVar2.f39411x = null;
                ndVar2.f39412y = null;
                ndVar2.f39396i0 = null;
                ndVar2.f39397j0 = null;
                ndVar2.f39399l0 = null;
                ndVar2.f39398k0 = null;
                ndVar2.m0 = 0.0d;
                ndVar2.e0(false, true);
                ndVar2.f39390e.h(null, null, ndVar2.f39407s, null);
                ndVar2.h.setAnimation(ndVar2.G);
                ndVar2.G.K(0);
                return;
            case 2:
                this.f36480b.g0(true);
                return;
            default:
                nd ndVar3 = this.f36480b;
                ndVar3.f39394g0 = true;
                if (ndVar3.f39410w.length() > 0) {
                    ndVar3.d0(ndVar3.f39410w.getText().toString());
                }
                ndVar3.h0();
                return;
        }
    }
}
