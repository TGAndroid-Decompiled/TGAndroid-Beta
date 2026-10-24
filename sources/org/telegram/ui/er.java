package org.telegram.ui;
public final class er implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.qw0 {
    public final int f36991a;
    public final fr f36992b;

    public er(fr frVar, int i10) {
        this.f36991a = i10;
        this.f36992b = frVar;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        jr jrVar = this.f36992b.d;
        return jrVar.h0(jrVar.f38616a.E(((Integer) a5Var.getTag()).intValue()), !z10, a5Var);
    }

    @Override
    public void i(int i10) {
        boolean z10;
        switch (this.f36991a) {
            case 1:
                jr jrVar = this.f36992b.d;
                if (jrVar.f38656s != null) {
                    int i11 = jrVar.f38650p1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    jrVar.f38650p1 = i10;
                    if (z10) {
                        dr w02 = jrVar.w0();
                        jrVar.B0();
                        jrVar.A0(w02);
                    }
                    jrVar.f38616a.m(jrVar.P0);
                    return;
                }
                return;
            default:
                this.f36992b.d.f38658s1 = i10 + 1;
                return;
        }
    }

    @Override
    public void m() {
        int i10 = this.f36991a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
