package org.telegram.ui;
public final class dr implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.av0 {
    public final int f37585a;
    public final er f37586b;

    public dr(er erVar, int i9) {
        this.f37585a = i9;
        this.f37586b = erVar;
    }

    @Override
    public boolean d(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        jr jrVar = this.f37586b.d;
        return jrVar.g0(jrVar.f39557a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override
    public void h(int i9) {
        boolean z10;
        switch (this.f37585a) {
            case 1:
                jr jrVar = this.f37586b.d;
                if (jrVar.f39598s != null) {
                    int i10 = jrVar.l1;
                    if ((i10 > 0 && i9 == 0) || (i10 == 0 && i9 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    jrVar.l1 = i9;
                    if (z10) {
                        cr v02 = jrVar.v0();
                        jrVar.A0();
                        jrVar.z0(v02);
                    }
                    jrVar.f39557a.m(jrVar.L0);
                    return;
                }
                return;
            default:
                this.f37586b.d.f39590o1 = i9 + 1;
                return;
        }
    }

    @Override
    public void m() {
        int i9 = this.f37585a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
