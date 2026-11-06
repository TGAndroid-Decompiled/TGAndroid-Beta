package org.telegram.ui;
public final class nc0 implements Runnable {
    public final int f47997a;
    public final oc0 f47998b;

    public nc0(oc0 oc0Var, int i7) {
        this.f47997a = i7;
        this.f47998b = oc0Var;
    }

    @Override
    public final void run() {
        switch (this.f47997a) {
            case 0:
                oc0 oc0Var = this.f47998b;
                pc0 pc0Var = oc0Var.d;
                if (oc0Var.f48341b) {
                    boolean z9 = pc0Var.L;
                    org.telegram.ui.Components.zg0 zg0Var = pc0Var.K;
                    yc ycVar = pc0Var.f48797n;
                    if (z9 && System.currentTimeMillis() - oc0Var.f48340a >= 10000) {
                        ycVar.setAnimation(zg0Var);
                        zg0Var.N(0, false, false);
                        zg0Var.f40950t0 = new nc0(oc0Var, 1);
                        ycVar.d();
                        oc0Var.f48340a = System.currentTimeMillis();
                    }
                    ycVar.postDelayed(oc0Var.f48342c, 1000L);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.h3(new nc0(this.f47998b, 2));
                return;
            default:
                pc0 pc0Var2 = this.f47998b.d;
                org.telegram.ui.Components.zg0 zg0Var2 = pc0Var2.J;
                zg0Var2.N(0, false, false);
                pc0Var2.f48797n.setAnimation(zg0Var2);
                return;
        }
    }
}
