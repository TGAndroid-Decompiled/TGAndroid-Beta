package org.telegram.ui;
public final class bj extends gf.e {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.q1 f36064f;
    public final un f36065g;

    public bj(un unVar, int i10, org.telegram.ui.Cells.q1 q1Var, int i11) {
        this.d = i11;
        this.f36065g = unVar;
        this.e = i10;
        this.f36064f = q1Var;
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
                un unVar = this.f36065g;
                unVar.Sb = i10;
                unVar.Tb = 6;
                this.f36064f.invalidate();
                return;
            case 1:
                int i11 = this.e;
                un unVar2 = this.f36065g;
                unVar2.Sb = i11;
                unVar2.Tb = 5;
                unVar2.Vb = null;
                this.f36064f.invalidate();
                return;
            default:
                int i12 = this.e;
                un unVar3 = this.f36065g;
                unVar3.Sb = i12;
                unVar3.Tb = 7;
                this.f36064f.invalidate();
                return;
        }
    }
}
