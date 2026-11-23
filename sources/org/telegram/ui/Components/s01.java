package org.telegram.ui.Components;
public final class s01 implements Runnable {
    public final int f39448a;
    public final f11 f39449b;

    public s01(f11 f11Var, int i7) {
        this.f39448a = i7;
        this.f39449b = f11Var;
    }

    @Override
    public final void run() {
        v4.c0 c0Var;
        switch (this.f39448a) {
            case 0:
                f11 f11Var = this.f39449b;
                f11Var.P = null;
                f11Var.k();
                return;
            default:
                f11 f11Var2 = this.f39449b;
                long j3 = f11Var2.f34948b;
                if (!f11Var2.d && f11Var2.f34972y > 0.0f && (c0Var = (v4.c0) f11Var2.f34968r.getLayoutManager()) != null && c0Var.N0() >= f11Var2.f34969s.f33317c.size() - 3) {
                    if (f11Var2.j()) {
                        f11Var2.k();
                        return;
                    }
                    org.telegram.messenger.d00 d00Var = org.telegram.messenger.mp.u1(f11Var2.f34946a).f25864t7;
                    long j10 = -j3;
                    if (!d00Var.e(j10)) {
                        d00Var.o(j10);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
