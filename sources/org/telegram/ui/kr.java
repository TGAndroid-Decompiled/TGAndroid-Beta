package org.telegram.ui;
public final class kr implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.dw0 {
    public final int f35162a;
    public final lr f35163b;

    public kr(lr lrVar, int i10) {
        this.f35162a = i10;
        this.f35163b = lrVar;
    }

    @Override
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        pr prVar = this.f35163b.d;
        return prVar.h0(prVar.f36610a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override
    public void h(int i10) {
        boolean z10;
        switch (this.f35162a) {
            case 1:
                pr prVar = this.f35163b.d;
                if (prVar.f36650s != null) {
                    int i11 = prVar.f36644p1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    prVar.f36644p1 = i10;
                    if (z10) {
                        jr w02 = prVar.w0();
                        prVar.B0();
                        prVar.A0(w02);
                    }
                    prVar.f36610a.m(prVar.P0);
                    return;
                }
                return;
            default:
                this.f35163b.d.f36652s1 = i10 + 1;
                return;
        }
    }

    @Override
    public void n() {
        int i10 = this.f35162a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
