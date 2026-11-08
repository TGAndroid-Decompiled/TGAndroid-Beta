package org.telegram.ui;
public final class nc0 implements Runnable {
    public final int f48023a;
    public final oc0 f48024b;

    public nc0(oc0 oc0Var, int i7) {
        this.f48023a = i7;
        this.f48024b = oc0Var;
    }

    @Override
    public final void run() {
        switch (this.f48023a) {
            case 0:
                oc0 oc0Var = this.f48024b;
                pc0 pc0Var = oc0Var.d;
                if (oc0Var.f48372b) {
                    boolean z9 = pc0Var.L;
                    org.telegram.ui.Components.zg0 zg0Var = pc0Var.K;
                    yc ycVar = pc0Var.f48787n;
                    if (z9 && System.currentTimeMillis() - oc0Var.f48371a >= 10000) {
                        ycVar.setAnimation(zg0Var);
                        zg0Var.N(0, false, false);
                        zg0Var.f41014t0 = new nc0(oc0Var, 1);
                        ycVar.d();
                        oc0Var.f48371a = System.currentTimeMillis();
                    }
                    ycVar.postDelayed(oc0Var.f48373c, 1000L);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.h3(new nc0(this.f48024b, 2));
                return;
            default:
                pc0 pc0Var2 = this.f48024b.d;
                org.telegram.ui.Components.zg0 zg0Var2 = pc0Var2.J;
                zg0Var2.N(0, false, false);
                pc0Var2.f48787n.setAnimation(zg0Var2);
                return;
        }
    }
}
