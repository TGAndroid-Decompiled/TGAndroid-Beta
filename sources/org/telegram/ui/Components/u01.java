package org.telegram.ui.Components;
public final class u01 implements Runnable {
    public final int f40192a;
    public final h11 f40193b;

    public u01(h11 h11Var, int i7) {
        this.f40192a = i7;
        this.f40193b = h11Var;
    }

    @Override
    public final void run() {
        v4.c0 c0Var;
        switch (this.f40192a) {
            case 0:
                h11 h11Var = this.f40193b;
                h11Var.P = null;
                h11Var.k();
                return;
            default:
                h11 h11Var2 = this.f40193b;
                long j3 = h11Var2.f35728b;
                if (!h11Var2.d && h11Var2.f35752y > 0.0f && (c0Var = (v4.c0) h11Var2.f35748r.getLayoutManager()) != null && c0Var.N0() >= h11Var2.f35749s.f33982c.size() - 3) {
                    if (h11Var2.j()) {
                        h11Var2.k();
                        return;
                    }
                    org.telegram.messenger.e00 e00Var = org.telegram.messenger.mp.u1(h11Var2.f35726a).f25797t7;
                    long j10 = -j3;
                    if (!e00Var.e(j10)) {
                        e00Var.o(j10);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
