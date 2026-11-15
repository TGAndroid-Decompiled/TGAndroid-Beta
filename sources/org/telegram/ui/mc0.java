package org.telegram.ui;
public final class mc0 implements Runnable {
    public final int f49209a;
    public final nc0 f49210b;

    public mc0(nc0 nc0Var, int i7) {
        this.f49209a = i7;
        this.f49210b = nc0Var;
    }

    @Override
    public final void run() {
        switch (this.f49209a) {
            case 0:
                nc0 nc0Var = this.f49210b;
                oc0 oc0Var = nc0Var.d;
                if (nc0Var.f49544b) {
                    boolean z10 = oc0Var.M;
                    org.telegram.ui.Components.ch0 ch0Var = oc0Var.L;
                    xc xcVar = oc0Var.f49911n;
                    if (z10 && System.currentTimeMillis() - nc0Var.f49543a >= 10000) {
                        xcVar.setAnimation(ch0Var);
                        ch0Var.N(0, false, false);
                        ch0Var.f33599u0 = new mc0(nc0Var, 1);
                        xcVar.d();
                        nc0Var.f49543a = System.currentTimeMillis();
                    }
                    xcVar.postDelayed(nc0Var.f49545c, 1000L);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.h3(new mc0(this.f49210b, 2));
                return;
            default:
                oc0 oc0Var2 = this.f49210b.d;
                org.telegram.ui.Components.ch0 ch0Var2 = oc0Var2.K;
                ch0Var2.N(0, false, false);
                oc0Var2.f49911n.setAnimation(ch0Var2);
                return;
        }
    }
}
