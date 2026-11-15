package org.telegram.ui;
public final class mc0 implements Runnable {
    public final int f49213a;
    public final nc0 f49214b;

    public mc0(nc0 nc0Var, int i7) {
        this.f49213a = i7;
        this.f49214b = nc0Var;
    }

    @Override
    public final void run() {
        switch (this.f49213a) {
            case 0:
                nc0 nc0Var = this.f49214b;
                oc0 oc0Var = nc0Var.d;
                if (nc0Var.f49545b) {
                    boolean z10 = oc0Var.M;
                    org.telegram.ui.Components.ch0 ch0Var = oc0Var.L;
                    xc xcVar = oc0Var.f49921n;
                    if (z10 && System.currentTimeMillis() - nc0Var.f49544a >= 10000) {
                        xcVar.setAnimation(ch0Var);
                        ch0Var.N(0, false, false);
                        ch0Var.f33597u0 = new mc0(nc0Var, 1);
                        xcVar.d();
                        nc0Var.f49544a = System.currentTimeMillis();
                    }
                    xcVar.postDelayed(nc0Var.f49546c, 1000L);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.h3(new mc0(this.f49214b, 2));
                return;
            default:
                oc0 oc0Var2 = this.f49214b.d;
                org.telegram.ui.Components.ch0 ch0Var2 = oc0Var2.K;
                ch0Var2.N(0, false, false);
                oc0Var2.f49921n.setAnimation(ch0Var2);
                return;
        }
    }
}
