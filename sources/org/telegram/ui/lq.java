package org.telegram.ui;
public final class lq implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.vt0 {
    public final int f49023a;
    public final mq f49024b;

    public lq(mq mqVar, int i7) {
        this.f49023a = i7;
        this.f49024b = mqVar;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        qq qqVar = this.f49024b.d;
        return qqVar.m0(qqVar.f50709a.E(((Integer) a5Var.getTag()).intValue()), !z10, a5Var);
    }

    @Override
    public void l(int i7) {
        boolean z10;
        switch (this.f49023a) {
            case 1:
                qq qqVar = this.f49024b.d;
                if (qqVar.f50746r != null) {
                    int i10 = qqVar.f50743p1;
                    if ((i10 > 0 && i7 == 0) || (i10 == 0 && i7 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    qqVar.f50743p1 = i7;
                    if (z10) {
                        kq B0 = qqVar.B0();
                        qqVar.G0();
                        qqVar.F0(B0);
                    }
                    qqVar.f50709a.g(qqVar.P0);
                    return;
                }
                return;
            default:
                this.f49024b.d.f50751s1 = i7 + 1;
                return;
        }
    }

    @Override
    public void p() {
        int i7 = this.f49023a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
