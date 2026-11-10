package org.telegram.ui;
public final class mq implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.vt0 {
    public final int f48039a;
    public final nq f48040b;

    public mq(nq nqVar, int i7) {
        this.f48039a = i7;
        this.f48040b = nqVar;
    }

    @Override
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z9) {
        rq rqVar = this.f48040b.d;
        return rqVar.m0(rqVar.f49496a.E(((Integer) a5Var.getTag()).intValue()), !z9, a5Var);
    }

    @Override
    public void m(int i7) {
        boolean z9;
        switch (this.f48039a) {
            case 1:
                rq rqVar = this.f48040b.d;
                if (rqVar.f49533r != null) {
                    int i10 = rqVar.f49528o1;
                    if ((i10 > 0 && i7 == 0) || (i10 == 0 && i7 > 0)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    rqVar.f49528o1 = i7;
                    if (z9) {
                        lq B0 = rqVar.B0();
                        rqVar.G0();
                        rqVar.F0(B0);
                    }
                    rqVar.f49496a.g(rqVar.O0);
                    return;
                }
                return;
            default:
                this.f48040b.d.f49535r1 = i7 + 1;
                return;
        }
    }

    @Override
    public void n() {
        int i7 = this.f48039a;
    }

    private final void a() {
    }

    private final void c() {
    }
}
