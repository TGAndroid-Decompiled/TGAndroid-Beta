package org.telegram.ui;
public final class bj extends gf.e {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.q1 f36266f;
    public final un f36267g;

    public bj(un unVar, int i10, org.telegram.ui.Cells.q1 q1Var, int i11) {
        this.d = i11;
        this.f36267g = unVar;
        this.e = i10;
        this.f36266f = q1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new ag.d3(this, this.e, 18), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new ag.d3(this, this.e, 20), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new ag.d3(this, this.e, 21), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.e;
                un unVar = this.f36267g;
                unVar.Rb = i10;
                unVar.Sb = 6;
                this.f36266f.invalidate();
                return;
            case 1:
                int i11 = this.e;
                un unVar2 = this.f36267g;
                unVar2.Rb = i11;
                unVar2.Sb = 5;
                unVar2.Ub = null;
                this.f36266f.invalidate();
                return;
            default:
                int i12 = this.e;
                un unVar3 = this.f36267g;
                unVar3.Rb = i12;
                unVar3.Sb = 7;
                this.f36266f.invalidate();
                return;
        }
    }
}
