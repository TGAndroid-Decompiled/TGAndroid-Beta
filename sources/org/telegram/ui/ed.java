package org.telegram.ui;
public final class ed implements Runnable {
    public final int f36443a;
    public final nd f36444b;

    public ed(nd ndVar, int i10) {
        this.f36443a = i10;
        this.f36444b = ndVar;
    }

    @Override
    public final void run() {
        switch (this.f36443a) {
            case 0:
                nd ndVar = this.f36444b;
                ndVar.f39308g0 = true;
                ndVar.h0();
                return;
            case 1:
                nd ndVar2 = this.f36444b;
                ndVar2.f39325x = null;
                ndVar2.f39326y = null;
                ndVar2.f39310i0 = null;
                ndVar2.f39311j0 = null;
                ndVar2.f39313l0 = null;
                ndVar2.f39312k0 = null;
                ndVar2.m0 = 0.0d;
                ndVar2.e0(false, true);
                ndVar2.f39304e.h(null, null, ndVar2.f39321s, null);
                ndVar2.h.setAnimation(ndVar2.G);
                ndVar2.G.K(0);
                return;
            case 2:
                this.f36444b.g0(true);
                return;
            default:
                nd ndVar3 = this.f36444b;
                ndVar3.f39308g0 = true;
                if (ndVar3.f39324w.length() > 0) {
                    ndVar3.d0(ndVar3.f39324w.getText().toString());
                }
                ndVar3.h0();
                return;
        }
    }
}
