package org.telegram.ui;
public final class bb0 implements Runnable {
    public final int f36020a;
    public final xb0 f36021b;

    public bb0(xb0 xb0Var, int i10) {
        this.f36020a = i10;
        this.f36021b = xb0Var;
    }

    @Override
    public final void run() {
        switch (this.f36020a) {
            case 0:
                xb0.e0(this.f36021b);
                return;
            case 1:
                xb0 xb0Var = this.f36021b;
                xb0Var.getLocationController().o(0, xb0Var.f43317n0, true);
                xb0Var.E = false;
                return;
            case 2:
                xb0 xb0Var2 = this.f36021b;
                org.telegram.messenger.va vaVar = xb0Var2.H;
                if (vaVar != null) {
                    xb0Var2.G.i(vaVar);
                    xb0Var2.H = null;
                    return;
                }
                return;
            case 3:
                xb0.c0(this.f36021b);
                return;
            case 4:
                xb0 xb0Var3 = this.f36021b;
                org.telegram.messenger.ha haVar = xb0Var3.G;
                if (haVar != null) {
                    haVar.q(org.telegram.messenger.i0.L(70.0f), 0, org.telegram.messenger.i0.L(70.0f), xb0Var3.v0());
                }
                if (!xb0Var3.P.getRadiusSet()) {
                    double d = xb0Var3.N;
                    if (d > 0.0d) {
                        xb0Var3.M.H0(d);
                    } else {
                        m4.c cVar = xb0Var3.M;
                        if (cVar != null) {
                            cVar.v0();
                            xb0Var3.M = null;
                        }
                    }
                }
                xb0Var3.P = null;
                return;
            case 5:
                this.f36021b.F0();
                return;
            case 6:
                xb0 xb0Var4 = this.f36021b;
                tb0 tb0Var = xb0Var4.f43328w;
                if (tb0Var != null) {
                    tb0Var.a();
                }
                xb0Var4.F0();
                return;
            default:
                org.telegram.messenger.i0.g3(new bb0(this.f36021b, 2));
                return;
        }
    }
}
