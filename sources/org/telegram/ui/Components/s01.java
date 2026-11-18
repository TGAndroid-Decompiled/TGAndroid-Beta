package org.telegram.ui.Components;
public final class s01 implements Runnable {
    public final int f39437a;
    public final f11 f39438b;

    public s01(f11 f11Var, int i7) {
        this.f39437a = i7;
        this.f39438b = f11Var;
    }

    @Override
    public final void run() {
        v4.c0 c0Var;
        switch (this.f39437a) {
            case 0:
                f11 f11Var = this.f39438b;
                f11Var.P = null;
                f11Var.k();
                return;
            default:
                f11 f11Var2 = this.f39438b;
                long j3 = f11Var2.f34875b;
                if (!f11Var2.d && f11Var2.f34899y > 0.0f && (c0Var = (v4.c0) f11Var2.f34895r.getLayoutManager()) != null && c0Var.N0() >= f11Var2.f34896s.f33221c.size() - 3) {
                    if (f11Var2.j()) {
                        f11Var2.k();
                        return;
                    }
                    org.telegram.messenger.e00 e00Var = org.telegram.messenger.mp.u1(f11Var2.f34873a).f25769t7;
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
