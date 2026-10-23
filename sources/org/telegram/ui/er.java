package org.telegram.ui;
public final class er implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.rw0 {
    public final int f37016a;
    public final fr f37017b;

    public er(fr frVar, int i10) {
        this.f37016a = i10;
        this.f37017b = frVar;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        jr jrVar = this.f37017b.d;
        return jrVar.h0(jrVar.f38628a.E(((Integer) a5Var.getTag()).intValue()), !z10, a5Var);
    }

    @Override
    public void i(int i10) {
        boolean z10;
        switch (this.f37016a) {
            case 1:
                jr jrVar = this.f37017b.d;
                if (jrVar.f38668s != null) {
                    int i11 = jrVar.f38662p1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    jrVar.f38662p1 = i10;
                    if (z10) {
                        dr w02 = jrVar.w0();
                        jrVar.B0();
                        jrVar.A0(w02);
                    }
                    jrVar.f38628a.m(jrVar.P0);
                    return;
                }
                return;
            default:
                this.f37017b.d.f38670s1 = i10 + 1;
                return;
        }
    }

    @Override
    public void m() {
        int i10 = this.f37016a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
