package org.telegram.ui;
public final class fd implements Runnable {
    public final int f36874a;
    public final od f36875b;

    public fd(od odVar, int i10) {
        this.f36874a = i10;
        this.f36875b = odVar;
    }

    @Override
    public final void run() {
        switch (this.f36874a) {
            case 0:
                od odVar = this.f36875b;
                odVar.f39736j0 = true;
                odVar.h0();
                return;
            case 1:
                od odVar2 = this.f36875b;
                odVar2.f39753x = null;
                odVar2.f39754y = null;
                odVar2.f39738l0 = null;
                odVar2.m0 = null;
                odVar2.f39741o0 = null;
                odVar2.f39740n0 = null;
                odVar2.f39742p0 = 0.0d;
                odVar2.e0(false, true);
                odVar2.e.h(null, null, odVar2.f39746s, null);
                odVar2.h.setAnimation(odVar2.J);
                odVar2.J.M(0);
                return;
            case 2:
                this.f36875b.g0(true);
                return;
            default:
                od odVar3 = this.f36875b;
                odVar3.f39736j0 = true;
                if (odVar3.f39751w.length() > 0) {
                    odVar3.d0(odVar3.f39751w.getText().toString());
                }
                odVar3.h0();
                return;
        }
    }
}
