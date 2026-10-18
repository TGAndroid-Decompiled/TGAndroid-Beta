package org.telegram.ui;
public final class er implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.mw0 {
    public final int f36591a;
    public final fr f36592b;

    public er(fr frVar, int i10) {
        this.f36591a = i10;
        this.f36592b = frVar;
    }

    @Override
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        jr jrVar = this.f36592b.d;
        return jrVar.h0(jrVar.f38258a.E(((Integer) a5Var.getTag()).intValue()), !z10, a5Var);
    }

    @Override
    public void h(int i10) {
        boolean z10;
        switch (this.f36591a) {
            case 1:
                jr jrVar = this.f36592b.d;
                if (jrVar.f38298s != null) {
                    int i11 = jrVar.f38292p1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    jrVar.f38292p1 = i10;
                    if (z10) {
                        dr w02 = jrVar.w0();
                        jrVar.B0();
                        jrVar.A0(w02);
                    }
                    jrVar.f38258a.m(jrVar.P0);
                    return;
                }
                return;
            default:
                this.f36592b.d.f38300s1 = i10 + 1;
                return;
        }
    }

    @Override
    public void m() {
        int i10 = this.f36591a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
