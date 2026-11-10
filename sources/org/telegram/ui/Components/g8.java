package org.telegram.ui.Components;
public final class g8 implements org.telegram.ui.ActionBar.r1, up {
    public final int f33830a;
    public final s8 f33831b;

    public g8(s8 s8Var, int i7) {
        this.f33830a = i7;
        this.f33831b = s8Var;
    }

    @Override
    public void c(int i7, int i10, boolean z9) {
        s8 s8Var = this.f33831b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        o8 o8Var = s8Var.Y;
                        int i11 = o8Var.f36537f;
                        if (i11 != i7 && (i11 == 0 || i7 == 0)) {
                            o8 a10 = o8Var.a();
                            s8Var.Y = a10;
                            s8Var.f37887a.b(a10, true);
                            s8Var.s0();
                        }
                        s8Var.Y.f36537f = i7;
                    }
                } else {
                    o8 o8Var2 = s8Var.Y;
                    int i12 = o8Var2.f36536e;
                    if (i12 != i7 && (i12 == 0 || i7 == 0)) {
                        o8 a11 = o8Var2.a();
                        s8Var.Y = a11;
                        s8Var.f37887a.b(a11, true);
                        s8Var.s0();
                    }
                    s8Var.Y.f36536e = i7;
                }
            } else {
                o8 o8Var3 = s8Var.Y;
                int i13 = o8Var3.d;
                if (i13 != i7 && (i13 == 0 || i7 == 0)) {
                    o8 a12 = o8Var3.a();
                    s8Var.Y = a12;
                    s8Var.f37887a.b(a12, true);
                    s8Var.s0();
                }
                s8Var.Y.d = i7;
            }
        } else {
            o8 o8Var4 = s8Var.Y;
            int i14 = o8Var4.f36535c;
            if (i14 != i7 && (i14 == 0 || i7 == 0)) {
                o8 a13 = o8Var4.a();
                s8Var.Y = a13;
                s8Var.f37887a.b(a13, true);
                s8Var.s0();
            }
            s8Var.Y.f36535c = i7;
        }
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25072r4, new Object[0]);
        s8Var.f37887a.invalidate();
    }

    @Override
    public int d(int i7) {
        return 0;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f33830a) {
            case 0:
                this.f33831b.finishFragment();
                return;
            default:
                this.f33831b.finishFragment();
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
