package org.telegram.ui;
public final class cb0 implements Runnable {
    public final int f36432a;
    public final yb0 f36433b;

    public cb0(yb0 yb0Var, int i10) {
        this.f36432a = i10;
        this.f36433b = yb0Var;
    }

    @Override
    public final void run() {
        switch (this.f36432a) {
            case 0:
                yb0.d0(this.f36433b);
                return;
            case 1:
                yb0 yb0Var = this.f36433b;
                yb0Var.getLocationController().o(0, yb0Var.f43797n0, true);
                yb0Var.E = false;
                return;
            case 2:
                yb0 yb0Var2 = this.f36433b;
                org.telegram.messenger.ua uaVar = yb0Var2.H;
                if (uaVar != null) {
                    yb0Var2.G.i(uaVar);
                    yb0Var2.H = null;
                    return;
                }
                return;
            case 3:
                yb0.b0(this.f36433b);
                return;
            case 4:
                yb0 yb0Var3 = this.f36433b;
                org.telegram.messenger.ga gaVar = yb0Var3.G;
                if (gaVar != null) {
                    gaVar.q(org.telegram.messenger.i0.L(70.0f), 0, org.telegram.messenger.i0.L(70.0f), yb0Var3.u0());
                }
                if (!yb0Var3.P.getRadiusSet()) {
                    double d = yb0Var3.N;
                    if (d > 0.0d) {
                        yb0Var3.M.H0(d);
                    } else {
                        m4.c cVar = yb0Var3.M;
                        if (cVar != null) {
                            cVar.v0();
                            yb0Var3.M = null;
                        }
                    }
                }
                yb0Var3.P = null;
                return;
            case 5:
                this.f36433b.E0();
                return;
            case 6:
                yb0 yb0Var4 = this.f36433b;
                ub0 ub0Var = yb0Var4.f43808w;
                if (ub0Var != null) {
                    ub0Var.a();
                }
                yb0Var4.E0();
                return;
            default:
                org.telegram.messenger.i0.g3(new cb0(this.f36433b, 2));
                return;
        }
    }
}
