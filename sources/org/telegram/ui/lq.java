package org.telegram.ui;
public final class lq implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.wt0 {
    public final int f47664a;
    public final mq f47665b;

    public lq(mq mqVar, int i7) {
        this.f47664a = i7;
        this.f47665b = mqVar;
    }

    @Override
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z9) {
        qq qqVar = this.f47665b.d;
        return qqVar.m0(qqVar.f49115a.E(((Integer) a5Var.getTag()).intValue()), !z9, a5Var);
    }

    @Override
    public void m(int i7) {
        boolean z9;
        switch (this.f47664a) {
            case 1:
                qq qqVar = this.f47665b.d;
                if (qqVar.f49152r != null) {
                    int i10 = qqVar.f49147o1;
                    if ((i10 > 0 && i7 == 0) || (i10 == 0 && i7 > 0)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    qqVar.f49147o1 = i7;
                    if (z9) {
                        kq B0 = qqVar.B0();
                        qqVar.G0();
                        qqVar.F0(B0);
                    }
                    qqVar.f49115a.g(qqVar.O0);
                    return;
                }
                return;
            default:
                this.f47665b.d.f49154r1 = i7 + 1;
                return;
        }
    }

    @Override
    public void n() {
        int i7 = this.f47664a;
    }

    private final void a() {
    }

    private final void c() {
    }
}
