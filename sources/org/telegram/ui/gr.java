package org.telegram.ui;

public final class gr implements org.telegram.ui.Cells.x4, org.telegram.ui.Components.cv0 {

    public final int f38467a;

    public final hr f38468b;

    public gr(hr hrVar, int i10) {
        this.f38467a = i10;
        this.f38468b = hrVar;
    }

    @Override
    public boolean d(org.telegram.ui.Cells.y4 y4Var, boolean z10) {
        lr lrVar = this.f38468b.d;
        return lrVar.h0(lrVar.f40179a.E(((Integer) y4Var.getTag()).intValue()), !z10, y4Var);
    }

    @Override
    public void j(int i10) {
        switch (this.f38467a) {
            case 1:
                lr lrVar = this.f38468b.d;
                if (lrVar.f40220s != null) {
                    int i11 = lrVar.l1;
                    boolean z10 = (i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0);
                    lrVar.l1 = i10;
                    if (z10) {
                        er erVarW0 = lrVar.w0();
                        lrVar.B0();
                        lrVar.A0(erVarW0);
                    }
                    lrVar.f40179a.m(lrVar.L0);
                    break;
                }
                break;
            default:
                this.f38468b.d.f40212o1 = i10 + 1;
                break;
        }
    }

    @Override
    public void m() {
        int i10 = this.f38467a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
