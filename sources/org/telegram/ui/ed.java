package org.telegram.ui;
public final class ed implements Runnable {
    public final int f33219a;
    public final nd f33220b;

    public ed(nd ndVar, int i10) {
        this.f33219a = i10;
        this.f33220b = ndVar;
    }

    @Override
    public final void run() {
        switch (this.f33219a) {
            case 0:
                nd ndVar = this.f33220b;
                ndVar.f35947j0 = true;
                ndVar.h0();
                return;
            case 1:
                nd ndVar2 = this.f33220b;
                ndVar2.f35964x = null;
                ndVar2.f35965y = null;
                ndVar2.f35949l0 = null;
                ndVar2.m0 = null;
                ndVar2.f35952o0 = null;
                ndVar2.f35951n0 = null;
                ndVar2.f35953p0 = 0.0d;
                ndVar2.e0(false, true);
                ndVar2.e.h(null, null, ndVar2.f35957s, null);
                ndVar2.h.setAnimation(ndVar2.J);
                ndVar2.J.M(0);
                return;
            case 2:
                this.f33220b.g0(true);
                return;
            default:
                nd ndVar3 = this.f33220b;
                ndVar3.f35947j0 = true;
                if (ndVar3.f35962w.length() > 0) {
                    ndVar3.d0(ndVar3.f35962w.getText().toString());
                }
                ndVar3.h0();
                return;
        }
    }
}
