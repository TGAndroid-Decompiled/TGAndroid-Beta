package org.telegram.ui;
public final class mq implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.du0 {
    public final int f49940a;
    public final nq f49941b;

    public mq(nq nqVar, int i7) {
        this.f49940a = i7;
        this.f49941b = nqVar;
    }

    @Override
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        rq rqVar = this.f49941b.d;
        return rqVar.m0(rqVar.f51727a.E(((Integer) a5Var.getTag()).intValue()), !z10, a5Var);
    }

    @Override
    public void k(int i7) {
        boolean z10;
        switch (this.f49940a) {
            case 1:
                rq rqVar = this.f49941b.d;
                if (rqVar.f51764r != null) {
                    int i10 = rqVar.f51761p1;
                    if ((i10 > 0 && i7 == 0) || (i10 == 0 && i7 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    rqVar.f51761p1 = i7;
                    if (z10) {
                        lq B0 = rqVar.B0();
                        rqVar.G0();
                        rqVar.F0(B0);
                    }
                    rqVar.f51727a.g(rqVar.P0);
                    return;
                }
                return;
            default:
                this.f49941b.d.f51769s1 = i7 + 1;
                return;
        }
    }

    @Override
    public void o() {
        int i7 = this.f49940a;
    }

    private final void a() {
    }

    private final void c() {
    }
}
