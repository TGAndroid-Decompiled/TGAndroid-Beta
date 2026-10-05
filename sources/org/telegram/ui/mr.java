package org.telegram.ui;
public final class mr implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.pw0 {
    public final int f38736a;
    public final nr f38737b;

    public mr(nr nrVar, int i10) {
        this.f38736a = i10;
        this.f38737b = nrVar;
    }

    @Override
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        rr rrVar = this.f38737b.d;
        return rrVar.h0(rrVar.f40164a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override
    public void j(int i10) {
        boolean z10;
        switch (this.f38736a) {
            case 1:
                rr rrVar = this.f38737b.d;
                if (rrVar.f40205s != null) {
                    int i11 = rrVar.f40199p1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    rrVar.f40199p1 = i10;
                    if (z10) {
                        lr w02 = rrVar.w0();
                        rrVar.B0();
                        rrVar.A0(w02);
                    }
                    rrVar.f40164a.m(rrVar.P0);
                    return;
                }
                return;
            default:
                this.f38737b.d.f40207s1 = i10 + 1;
                return;
        }
    }

    @Override
    public void l() {
        int i10 = this.f38736a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
