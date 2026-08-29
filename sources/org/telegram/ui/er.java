package org.telegram.ui;
public final class er implements org.telegram.ui.Cells.y4, org.telegram.ui.Components.kv0 {
    public final int f37896a;
    public final fr f37897b;

    public er(fr frVar, int i10) {
        this.f37896a = i10;
        this.f37897b = frVar;
    }

    @Override
    public boolean d(org.telegram.ui.Cells.z4 z4Var, boolean z10) {
        jr jrVar = this.f37897b.d;
        return jrVar.h0(jrVar.f39618a.E(((Integer) z4Var.getTag()).intValue()), !z10, z4Var);
    }

    @Override
    public void h(int i10) {
        boolean z10;
        switch (this.f37896a) {
            case 1:
                jr jrVar = this.f37897b.d;
                if (jrVar.f39659s != null) {
                    int i11 = jrVar.l1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    jrVar.l1 = i10;
                    if (z10) {
                        dr w02 = jrVar.w0();
                        jrVar.B0();
                        jrVar.A0(w02);
                    }
                    jrVar.f39618a.m(jrVar.L0);
                    return;
                }
                return;
            default:
                this.f37897b.d.f39651o1 = i10 + 1;
                return;
        }
    }

    @Override
    public void m() {
        int i10 = this.f37896a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
