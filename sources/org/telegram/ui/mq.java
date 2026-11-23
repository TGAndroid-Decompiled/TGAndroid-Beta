package org.telegram.ui;
public final class mq implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.fu0 {
    public final int f50097a;
    public final nq f50098b;

    public mq(nq nqVar, int i7) {
        this.f50097a = i7;
        this.f50098b = nqVar;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        rq rqVar = this.f50098b.d;
        return rqVar.m0(rqVar.f51810a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override
    public void n(int i7) {
        boolean z10;
        switch (this.f50097a) {
            case 1:
                rq rqVar = this.f50098b.d;
                if (rqVar.f51847r != null) {
                    int i10 = rqVar.f51844p1;
                    if ((i10 > 0 && i7 == 0) || (i10 == 0 && i7 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    rqVar.f51844p1 = i7;
                    if (z10) {
                        lq B0 = rqVar.B0();
                        rqVar.G0();
                        rqVar.F0(B0);
                    }
                    rqVar.f51810a.g(rqVar.P0);
                    return;
                }
                return;
            default:
                this.f50098b.d.f51852s1 = i7 + 1;
                return;
        }
    }

    @Override
    public void o() {
        int i7 = this.f50097a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
