package org.telegram.ui;
public final class mq implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.du0 {
    public final int f49914a;
    public final nq f49915b;

    public mq(nq nqVar, int i7) {
        this.f49914a = i7;
        this.f49915b = nqVar;
    }

    @Override
    public boolean b(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        rq rqVar = this.f49915b.d;
        return rqVar.m0(rqVar.f51716a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override
    public void k(int i7) {
        boolean z10;
        switch (this.f49914a) {
            case 1:
                rq rqVar = this.f49915b.d;
                if (rqVar.f51753r != null) {
                    int i10 = rqVar.f51750p1;
                    if ((i10 > 0 && i7 == 0) || (i10 == 0 && i7 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    rqVar.f51750p1 = i7;
                    if (z10) {
                        lq B0 = rqVar.B0();
                        rqVar.G0();
                        rqVar.F0(B0);
                    }
                    rqVar.f51716a.g(rqVar.P0);
                    return;
                }
                return;
            default:
                this.f49915b.d.f51758s1 = i7 + 1;
                return;
        }
    }

    @Override
    public void o() {
        int i7 = this.f49914a;
    }

    private final void a() {
    }

    private final void c() {
    }
}
