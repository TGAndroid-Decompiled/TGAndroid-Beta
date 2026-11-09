package org.telegram.ui;
public final class pc0 implements Runnable {
    public final int f48697a;
    public final qc0 f48698b;

    public pc0(qc0 qc0Var, int i7) {
        this.f48697a = i7;
        this.f48698b = qc0Var;
    }

    @Override
    public final void run() {
        switch (this.f48697a) {
            case 0:
                qc0 qc0Var = this.f48698b;
                rc0 rc0Var = qc0Var.d;
                if (qc0Var.f49022b) {
                    boolean z9 = rc0Var.L;
                    org.telegram.ui.Components.ah0 ah0Var = rc0Var.K;
                    yc ycVar = rc0Var.f49446n;
                    if (z9 && System.currentTimeMillis() - qc0Var.f49021a >= 10000) {
                        ycVar.setAnimation(ah0Var);
                        ah0Var.N(0, false, false);
                        ah0Var.f31845t0 = new pc0(qc0Var, 1);
                        ycVar.d();
                        qc0Var.f49021a = System.currentTimeMillis();
                    }
                    ycVar.postDelayed(qc0Var.f49023c, 1000L);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.h3(new pc0(this.f48698b, 2));
                return;
            default:
                rc0 rc0Var2 = this.f48698b.d;
                org.telegram.ui.Components.ah0 ah0Var2 = rc0Var2.J;
                ah0Var2.N(0, false, false);
                rc0Var2.f49446n.setAnimation(ah0Var2);
                return;
        }
    }
}
