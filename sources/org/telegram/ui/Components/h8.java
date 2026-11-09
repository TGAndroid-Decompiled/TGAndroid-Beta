package org.telegram.ui.Components;
public final class h8 implements org.telegram.ui.ActionBar.r1, up {
    public final int f34230a;
    public final t8 f34231b;

    public h8(t8 t8Var, int i7) {
        this.f34230a = i7;
        this.f34231b = t8Var;
    }

    @Override
    public void c(int i7, int i10, boolean z9) {
        t8 t8Var = this.f34231b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        p8 p8Var = t8Var.Y;
                        int i11 = p8Var.f36943f;
                        if (i11 != i7 && (i11 == 0 || i7 == 0)) {
                            p8 a10 = p8Var.a();
                            t8Var.Y = a10;
                            t8Var.f38314a.b(a10, true);
                            t8Var.s0();
                        }
                        t8Var.Y.f36943f = i7;
                    }
                } else {
                    p8 p8Var2 = t8Var.Y;
                    int i12 = p8Var2.f36942e;
                    if (i12 != i7 && (i12 == 0 || i7 == 0)) {
                        p8 a11 = p8Var2.a();
                        t8Var.Y = a11;
                        t8Var.f38314a.b(a11, true);
                        t8Var.s0();
                    }
                    t8Var.Y.f36942e = i7;
                }
            } else {
                p8 p8Var3 = t8Var.Y;
                int i13 = p8Var3.d;
                if (i13 != i7 && (i13 == 0 || i7 == 0)) {
                    p8 a12 = p8Var3.a();
                    t8Var.Y = a12;
                    t8Var.f38314a.b(a12, true);
                    t8Var.s0();
                }
                t8Var.Y.d = i7;
            }
        } else {
            p8 p8Var4 = t8Var.Y;
            int i14 = p8Var4.f36941c;
            if (i14 != i7 && (i14 == 0 || i7 == 0)) {
                p8 a13 = p8Var4.a();
                t8Var.Y = a13;
                t8Var.f38314a.b(a13, true);
                t8Var.s0();
            }
            t8Var.Y.f36941c = i7;
        }
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25068r4, new Object[0]);
        t8Var.f38314a.invalidate();
    }

    @Override
    public int d(int i7) {
        return 0;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f34230a) {
            case 0:
                this.f34231b.finishFragment();
                return;
            default:
                this.f34231b.finishFragment();
                return;
        }
    }

    @Override
    public void a(boolean z9) {
    }

    @Override
    public void b() {
    }
}
