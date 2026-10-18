package org.telegram.ui;
public final class er implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.mw0 {
    public final int f36607a;
    public final fr f36608b;

    public er(fr frVar, int i10) {
        this.f36607a = i10;
        this.f36608b = frVar;
    }

    @Override
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        jr jrVar = this.f36608b.d;
        return jrVar.h0(jrVar.f38273a.E(((Integer) a5Var.getTag()).intValue()), !z10, a5Var);
    }

    @Override
    public void h(int i10) {
        boolean z10;
        switch (this.f36607a) {
            case 1:
                jr jrVar = this.f36608b.d;
                if (jrVar.f38313s != null) {
                    int i11 = jrVar.f38307p1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    jrVar.f38307p1 = i10;
                    if (z10) {
                        dr w02 = jrVar.w0();
                        jrVar.B0();
                        jrVar.A0(w02);
                    }
                    jrVar.f38273a.m(jrVar.P0);
                    return;
                }
                return;
            default:
                this.f36608b.d.f38315s1 = i10 + 1;
                return;
        }
    }

    @Override
    public void m() {
        int i10 = this.f36607a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
