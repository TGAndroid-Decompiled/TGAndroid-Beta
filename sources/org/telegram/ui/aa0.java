package org.telegram.ui;
public final class aa0 implements Runnable {
    public final int f43622a;
    public final sa0 f43623b;

    public aa0(sa0 sa0Var, int i7) {
        this.f43622a = i7;
        this.f43623b = sa0Var;
    }

    @Override
    public final void run() {
        switch (this.f43622a) {
            case 0:
                sa0.c0(this.f43623b);
                return;
            case 1:
                sa0 sa0Var = this.f43623b;
                org.telegram.messenger.ua uaVar = sa0Var.F;
                if (uaVar != null) {
                    sa0Var.E.h(uaVar);
                    sa0Var.F = null;
                    return;
                }
                return;
            case 2:
                sa0.a0(this.f43623b);
                return;
            case 3:
                sa0 sa0Var2 = this.f43623b;
                sa0Var2.getLocationController().o(0, sa0Var2.f49783l0, true);
                sa0Var2.f49800y = false;
                return;
            case 4:
                sa0 sa0Var3 = this.f43623b;
                org.telegram.messenger.fa faVar = sa0Var3.E;
                if (faVar != null) {
                    faVar.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), sa0Var3.t0());
                }
                if (!sa0Var3.N.getRadiusSet()) {
                    double d = sa0Var3.L;
                    if (d > 0.0d) {
                        sa0Var3.K.V0(d);
                    } else {
                        m4.d0 d0Var = sa0Var3.K;
                        if (d0Var != null) {
                            d0Var.R0();
                            sa0Var3.K = null;
                        }
                    }
                }
                sa0Var3.N = null;
                return;
            case 5:
                this.f43623b.D0();
                return;
            case 6:
                this.f43623b.D0();
                return;
            default:
                org.telegram.messenger.g0.h3(new aa0(this.f43623b, 1));
                return;
        }
    }
}
