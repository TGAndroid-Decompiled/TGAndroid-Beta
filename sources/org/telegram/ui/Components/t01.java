package org.telegram.ui.Components;
public final class t01 implements Runnable {
    public final int f39699a;
    public final g11 f39700b;

    public t01(g11 g11Var, int i7) {
        this.f39699a = i7;
        this.f39700b = g11Var;
    }

    @Override
    public final void run() {
        v4.b0 b0Var;
        switch (this.f39699a) {
            case 0:
                g11 g11Var = this.f39700b;
                g11Var.P = null;
                g11Var.k();
                return;
            default:
                g11 g11Var2 = this.f39700b;
                long j3 = g11Var2.f35329b;
                if (!g11Var2.d && g11Var2.f35353y > 0.0f && (b0Var = (v4.b0) g11Var2.f35349r.getLayoutManager()) != null && b0Var.N0() >= g11Var2.f35350s.f33682c.size() - 3) {
                    if (g11Var2.j()) {
                        g11Var2.k();
                        return;
                    }
                    org.telegram.messenger.f00 f00Var = org.telegram.messenger.np.u1(g11Var2.f35327a).f25932t7;
                    long j10 = -j3;
                    if (!f00Var.e(j10)) {
                        f00Var.o(j10);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
