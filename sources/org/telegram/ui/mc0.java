package org.telegram.ui;
public final class mc0 implements Runnable {
    public final int f49833a;
    public final nc0 f49834b;

    public mc0(nc0 nc0Var, int i7) {
        this.f49833a = i7;
        this.f49834b = nc0Var;
    }

    @Override
    public final void run() {
        switch (this.f49833a) {
            case 0:
                nc0 nc0Var = this.f49834b;
                oc0 oc0Var = nc0Var.d;
                if (nc0Var.f50155b) {
                    boolean z10 = oc0Var.M;
                    org.telegram.ui.Components.mh0 mh0Var = oc0Var.L;
                    xc xcVar = oc0Var.f50581n;
                    if (z10 && System.currentTimeMillis() - nc0Var.f50154a >= 10000) {
                        xcVar.setAnimation(mh0Var);
                        mh0Var.N(0, false, false);
                        mh0Var.f37506u0 = new mc0(nc0Var, 1);
                        xcVar.d();
                        nc0Var.f50154a = System.currentTimeMillis();
                    }
                    xcVar.postDelayed(nc0Var.f50156c, 1000L);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.g3(new mc0(this.f49834b, 2));
                return;
            default:
                oc0 oc0Var2 = this.f49834b.d;
                org.telegram.ui.Components.mh0 mh0Var2 = oc0Var2.K;
                mh0Var2.N(0, false, false);
                oc0Var2.f50581n.setAnimation(mh0Var2);
                return;
        }
    }
}
