package org.telegram.ui.Components;
public final class gb implements o1.f {
    public final int f24325a;
    public final Object f24326b;

    public gb(Object obj, int i10) {
        this.f24325a = i10;
        this.f24326b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f24325a) {
            case 0:
                pc pcVar = (pc) this.f24326b;
                if (pcVar.d == hVar) {
                    pcVar.d = null;
                    return;
                }
                return;
            case 1:
                cb cbVar = (cb) this.f24326b;
                if (!z10) {
                    cbVar.run();
                    return;
                }
                return;
            case 2:
                ip0 ip0Var = (ip0) this.f24326b;
                ip0Var.f25102q = false;
                ip0Var.dismiss();
                return;
            case 3:
                jp0 jp0Var = (jp0) this.f24326b;
                jp0Var.f25426s = false;
                jp0Var.f25425r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == jp0Var.f25423f) {
                    jp0Var.f25423f = null;
                    return;
                }
                return;
            case 4:
                uq0 uq0Var = (uq0) this.f24326b;
                uq0Var.E.setVisibility(8);
                uq0Var.f28837z0.setVisibility(8);
                rq0 rq0Var = uq0Var.L;
                rq0Var.f27941f = null;
                rq0Var.l();
                uq0Var.B0 = null;
                uq0Var.M0 = false;
                return;
            default:
                uq0 uq0Var2 = ((bq0) this.f24326b).d;
                uq0Var2.F.setVisibility(8);
                uq0Var2.G.setVisibility(8);
                uq0Var2.f28836y0.setVisibility(8);
                uq0Var2.B0 = null;
                return;
        }
    }
}
