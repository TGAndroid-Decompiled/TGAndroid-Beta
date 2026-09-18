package org.telegram.ui;
public final class nr implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.ew0 {
    public final int f36037a;
    public final or f36038b;

    public nr(or orVar, int i10) {
        this.f36037a = i10;
        this.f36038b = orVar;
    }

    @Override
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        sr srVar = this.f36038b.d;
        return srVar.h0(srVar.f37392a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override
    public void h(int i10) {
        boolean z10;
        switch (this.f36037a) {
            case 1:
                sr srVar = this.f36038b.d;
                if (srVar.f37432s != null) {
                    int i11 = srVar.f37426p1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    srVar.f37426p1 = i10;
                    if (z10) {
                        mr w02 = srVar.w0();
                        srVar.B0();
                        srVar.A0(w02);
                    }
                    srVar.f37392a.m(srVar.P0);
                    return;
                }
                return;
            default:
                this.f36038b.d.f37434s1 = i10 + 1;
                return;
        }
    }

    @Override
    public void n() {
        int i10 = this.f36037a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
