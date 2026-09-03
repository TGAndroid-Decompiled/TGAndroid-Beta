package org.telegram.ui;
public final class mr implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.tv0 {
    public final int f36191a;
    public final nr f36192b;

    public mr(nr nrVar, int i10) {
        this.f36191a = i10;
        this.f36192b = nrVar;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z4) {
        rr rrVar = this.f36192b.d;
        return rrVar.h0(rrVar.f37955a.E(((Integer) a5Var.getTag()).intValue()), !z4, a5Var);
    }

    @Override
    public void g(int i10) {
        boolean z4;
        switch (this.f36191a) {
            case 1:
                rr rrVar = this.f36192b.d;
                if (rrVar.f37995s != null) {
                    int i11 = rrVar.f37982m1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    rrVar.f37982m1 = i10;
                    if (z4) {
                        lr w02 = rrVar.w0();
                        rrVar.B0();
                        rrVar.A0(w02);
                    }
                    rrVar.f37955a.m(rrVar.M0);
                    return;
                }
                return;
            default:
                this.f36192b.d.f37989p1 = i10 + 1;
                return;
        }
    }

    @Override
    public void j() {
        int i10 = this.f36191a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
