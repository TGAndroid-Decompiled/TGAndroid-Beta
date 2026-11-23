package org.telegram.ui.Components;
public final class t01 implements Runnable {
    public final int f39745a;
    public final g11 f39746b;

    public t01(g11 g11Var, int i7) {
        this.f39745a = i7;
        this.f39746b = g11Var;
    }

    @Override
    public final void run() {
        v4.c0 c0Var;
        switch (this.f39745a) {
            case 0:
                g11 g11Var = this.f39746b;
                g11Var.P = null;
                g11Var.k();
                return;
            default:
                g11 g11Var2 = this.f39746b;
                long j3 = g11Var2.f35367b;
                if (!g11Var2.d && g11Var2.f35391y > 0.0f && (c0Var = (v4.c0) g11Var2.f35387r.getLayoutManager()) != null && c0Var.N0() >= g11Var2.f35388s.f33705c.size() - 3) {
                    if (g11Var2.j()) {
                        g11Var2.k();
                        return;
                    }
                    org.telegram.messenger.f00 f00Var = org.telegram.messenger.np.u1(g11Var2.f35365a).f25968t7;
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
