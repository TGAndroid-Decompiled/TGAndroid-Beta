package org.telegram.ui;
public final class mc0 implements Runnable {
    public final int f50036a;
    public final nc0 f50037b;

    public mc0(nc0 nc0Var, int i7) {
        this.f50036a = i7;
        this.f50037b = nc0Var;
    }

    @Override
    public final void run() {
        switch (this.f50036a) {
            case 0:
                nc0 nc0Var = this.f50037b;
                oc0 oc0Var = nc0Var.d;
                if (nc0Var.f50292b) {
                    boolean z10 = oc0Var.M;
                    org.telegram.ui.Components.nh0 nh0Var = oc0Var.L;
                    xc xcVar = oc0Var.f50656n;
                    if (z10 && System.currentTimeMillis() - nc0Var.f50291a >= 10000) {
                        xcVar.setAnimation(nh0Var);
                        nh0Var.N(0, false, false);
                        nh0Var.f37825u0 = new mc0(nc0Var, 1);
                        xcVar.d();
                        nc0Var.f50291a = System.currentTimeMillis();
                    }
                    xcVar.postDelayed(nc0Var.f50293c, 1000L);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.g3(new mc0(this.f50037b, 2));
                return;
            default:
                oc0 oc0Var2 = this.f50037b.d;
                org.telegram.ui.Components.nh0 nh0Var2 = oc0Var2.K;
                nh0Var2.N(0, false, false);
                oc0Var2.f50656n.setAnimation(nh0Var2);
                return;
        }
    }
}
