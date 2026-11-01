package org.telegram.ui.Components;
public final class ko0 implements Runnable {
    public final int f27913a;
    public final pp0 f27914b;

    public ko0(pp0 pp0Var, int i10) {
        this.f27913a = i10;
        this.f27914b = pp0Var;
    }

    @Override
    public final void run() {
        switch (this.f27913a) {
            case 0:
                pp0 pp0Var = this.f27914b;
                pp0Var.f29495s2 = true;
                h10 h10Var = pp0Var.f29491q2;
                h10Var.f26635r.setText("");
                org.telegram.messenger.i0.J3(h10Var.f26635r);
                return;
            default:
                org.telegram.messenger.sz szVar = new org.telegram.messenger.sz(24);
                pp0 pp0Var2 = this.f27914b;
                if (pp0Var2.d) {
                    h10 h10Var2 = pp0Var2.f29491q2;
                    if (h10Var2 != null) {
                        org.telegram.messenger.i0.v1(h10Var2.f26635r);
                    }
                    org.telegram.messenger.i0.h3(szVar, 300L);
                    return;
                }
                szVar.run();
                return;
        }
    }
}
