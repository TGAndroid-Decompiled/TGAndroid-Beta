package org.telegram.ui;
public final class kr implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.tv0 {
    public final int f35797a;
    public final lr f35798b;

    public kr(lr lrVar, int i10) {
        this.f35797a = i10;
        this.f35798b = lrVar;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z4) {
        pr prVar = this.f35798b.d;
        return prVar.h0(prVar.f37444a.E(((Integer) b5Var.getTag()).intValue()), !z4, b5Var);
    }

    @Override
    public void h(int i10) {
        boolean z4;
        switch (this.f35797a) {
            case 1:
                pr prVar = this.f35798b.d;
                if (prVar.f37484s != null) {
                    int i11 = prVar.f37471m1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    prVar.f37471m1 = i10;
                    if (z4) {
                        jr w02 = prVar.w0();
                        prVar.B0();
                        prVar.A0(w02);
                    }
                    prVar.f37444a.m(prVar.M0);
                    return;
                }
                return;
            default:
                this.f35798b.d.f37478p1 = i10 + 1;
                return;
        }
    }

    @Override
    public void m() {
        int i10 = this.f35797a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
