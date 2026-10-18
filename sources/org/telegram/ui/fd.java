package org.telegram.ui;
public final class fd implements Runnable {
    public final int f36890a;
    public final od f36891b;

    public fd(od odVar, int i10) {
        this.f36890a = i10;
        this.f36891b = odVar;
    }

    @Override
    public final void run() {
        switch (this.f36890a) {
            case 0:
                od odVar = this.f36891b;
                odVar.f39744j0 = true;
                odVar.h0();
                return;
            case 1:
                od odVar2 = this.f36891b;
                odVar2.f39761x = null;
                odVar2.f39762y = null;
                odVar2.f39746l0 = null;
                odVar2.m0 = null;
                odVar2.f39749o0 = null;
                odVar2.f39748n0 = null;
                odVar2.f39750p0 = 0.0d;
                odVar2.e0(false, true);
                odVar2.e.h(null, null, odVar2.f39754s, null);
                odVar2.h.setAnimation(odVar2.J);
                odVar2.J.M(0);
                return;
            case 2:
                this.f36891b.g0(true);
                return;
            default:
                od odVar3 = this.f36891b;
                odVar3.f39744j0 = true;
                if (odVar3.f39759w.length() > 0) {
                    odVar3.d0(odVar3.f39759w.getText().toString());
                }
                odVar3.h0();
                return;
        }
    }
}
