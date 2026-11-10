package org.telegram.ui;
public final class qc0 implements Runnable {
    public final int f49012a;
    public final rc0 f49013b;

    public qc0(rc0 rc0Var, int i7) {
        this.f49012a = i7;
        this.f49013b = rc0Var;
    }

    @Override
    public final void run() {
        switch (this.f49012a) {
            case 0:
                rc0 rc0Var = this.f49013b;
                sc0 sc0Var = rc0Var.d;
                if (rc0Var.f49387b) {
                    boolean z9 = sc0Var.L;
                    org.telegram.ui.Components.zg0 zg0Var = sc0Var.K;
                    yc ycVar = sc0Var.f49824n;
                    if (z9 && System.currentTimeMillis() - rc0Var.f49386a >= 10000) {
                        ycVar.setAnimation(zg0Var);
                        zg0Var.N(0, false, false);
                        zg0Var.f40987t0 = new qc0(rc0Var, 1);
                        ycVar.d();
                        rc0Var.f49386a = System.currentTimeMillis();
                    }
                    ycVar.postDelayed(rc0Var.f49388c, 1000L);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.h3(new qc0(this.f49013b, 2));
                return;
            default:
                sc0 sc0Var2 = this.f49013b.d;
                org.telegram.ui.Components.zg0 zg0Var2 = sc0Var2.J;
                zg0Var2.N(0, false, false);
                sc0Var2.f49824n.setAnimation(zg0Var2);
                return;
        }
    }
}
