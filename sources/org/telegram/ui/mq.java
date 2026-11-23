package org.telegram.ui;
public final class mq implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.gu0 {
    public final int f49959a;
    public final nq f49960b;

    public mq(nq nqVar, int i7) {
        this.f49959a = i7;
        this.f49960b = nqVar;
    }

    @Override
    public boolean b(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        rq rqVar = this.f49960b.d;
        return rqVar.m0(rqVar.f51695a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override
    public void k(int i7) {
        boolean z10;
        switch (this.f49959a) {
            case 1:
                rq rqVar = this.f49960b.d;
                if (rqVar.f51732r != null) {
                    int i10 = rqVar.f51729p1;
                    if ((i10 > 0 && i7 == 0) || (i10 == 0 && i7 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    rqVar.f51729p1 = i7;
                    if (z10) {
                        lq B0 = rqVar.B0();
                        rqVar.G0();
                        rqVar.F0(B0);
                    }
                    rqVar.f51695a.g(rqVar.P0);
                    return;
                }
                return;
            default:
                this.f49960b.d.f51737s1 = i7 + 1;
                return;
        }
    }

    @Override
    public void o() {
        int i7 = this.f49959a;
    }

    private final void a() {
    }

    private final void c() {
    }
}
