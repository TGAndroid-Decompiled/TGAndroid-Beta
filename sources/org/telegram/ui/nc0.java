package org.telegram.ui;
public final class nc0 implements Runnable {
    public final int f50175a;
    public final oc0 f50176b;

    public nc0(oc0 oc0Var, int i7) {
        this.f50175a = i7;
        this.f50176b = oc0Var;
    }

    @Override
    public final void run() {
        switch (this.f50175a) {
            case 0:
                oc0 oc0Var = this.f50176b;
                pc0 pc0Var = oc0Var.d;
                if (oc0Var.f50556b) {
                    boolean z10 = pc0Var.M;
                    org.telegram.ui.Components.oh0 oh0Var = pc0Var.L;
                    xc xcVar = pc0Var.f50853n;
                    if (z10 && System.currentTimeMillis() - oc0Var.f50555a >= 10000) {
                        xcVar.setAnimation(oh0Var);
                        oh0Var.N(0, false, false);
                        oh0Var.f38230u0 = new nc0(oc0Var, 1);
                        xcVar.d();
                        oc0Var.f50555a = System.currentTimeMillis();
                    }
                    xcVar.postDelayed(oc0Var.f50557c, 1000L);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.g3(new nc0(this.f50176b, 2));
                return;
            default:
                pc0 pc0Var2 = this.f50176b.d;
                org.telegram.ui.Components.oh0 oh0Var2 = pc0Var2.K;
                oh0Var2.N(0, false, false);
                pc0Var2.f50853n.setAnimation(oh0Var2);
                return;
        }
    }
}
