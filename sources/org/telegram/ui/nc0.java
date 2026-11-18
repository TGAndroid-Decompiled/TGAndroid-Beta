package org.telegram.ui;
public final class nc0 implements Runnable {
    public final int f50144a;
    public final oc0 f50145b;

    public nc0(oc0 oc0Var, int i7) {
        this.f50144a = i7;
        this.f50145b = oc0Var;
    }

    @Override
    public final void run() {
        switch (this.f50144a) {
            case 0:
                oc0 oc0Var = this.f50145b;
                pc0 pc0Var = oc0Var.d;
                if (oc0Var.f50527b) {
                    boolean z10 = pc0Var.M;
                    org.telegram.ui.Components.mh0 mh0Var = pc0Var.L;
                    xc xcVar = pc0Var.f50808n;
                    if (z10 && System.currentTimeMillis() - oc0Var.f50526a >= 10000) {
                        xcVar.setAnimation(mh0Var);
                        mh0Var.N(0, false, false);
                        mh0Var.f37506u0 = new nc0(oc0Var, 1);
                        xcVar.d();
                        oc0Var.f50526a = System.currentTimeMillis();
                    }
                    xcVar.postDelayed(oc0Var.f50528c, 1000L);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.g3(new nc0(this.f50145b, 2));
                return;
            default:
                pc0 pc0Var2 = this.f50145b.d;
                org.telegram.ui.Components.mh0 mh0Var2 = pc0Var2.K;
                mh0Var2.N(0, false, false);
                pc0Var2.f50808n.setAnimation(mh0Var2);
                return;
        }
    }
}
