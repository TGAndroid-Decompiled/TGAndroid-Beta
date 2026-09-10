package org.telegram.ui.Components;
public final class gb implements o1.f {
    public final int f23317a;
    public final Object f23318b;

    public gb(Object obj, int i10) {
        this.f23317a = i10;
        this.f23318b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f23317a) {
            case 0:
                pc pcVar = (pc) this.f23318b;
                if (pcVar.d == hVar) {
                    pcVar.d = null;
                    return;
                }
                return;
            case 1:
                cb cbVar = (cb) this.f23318b;
                if (!z10) {
                    cbVar.run();
                    return;
                }
                return;
            case 2:
                fp0 fp0Var = (fp0) this.f23318b;
                fp0Var.f23056q = false;
                fp0Var.dismiss();
                return;
            case 3:
                hp0 hp0Var = (hp0) this.f23318b;
                hp0Var.f23747s = false;
                hp0Var.f23746r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == hp0Var.f23744f) {
                    hp0Var.f23744f = null;
                    return;
                }
                return;
            case 4:
                sq0 sq0Var = (sq0) this.f23318b;
                sq0Var.E.setVisibility(8);
                sq0Var.f27199z0.setVisibility(8);
                pq0 pq0Var = sq0Var.L;
                pq0Var.f26235f = null;
                pq0Var.l();
                sq0Var.B0 = null;
                sq0Var.M0 = false;
                return;
            default:
                sq0 sq0Var2 = ((yp0) this.f23318b).d;
                sq0Var2.F.setVisibility(8);
                sq0Var2.G.setVisibility(8);
                sq0Var2.f27198y0.setVisibility(8);
                sq0Var2.B0 = null;
                return;
        }
    }
}
