package org.telegram.ui.Components;
public final class l8 implements org.telegram.ui.ActionBar.q1, lq {
    public final int f37140a;
    public final y8 f37141b;

    public l8(y8 y8Var, int i7) {
        this.f37140a = i7;
        this.f37141b = y8Var;
    }

    @Override
    public void c(int i7, int i10, boolean z10) {
        y8 y8Var = this.f37141b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        u8 u8Var = y8Var.Z;
                        int i11 = u8Var.f40301f;
                        if (i11 != i7 && (i11 == 0 || i7 == 0)) {
                            u8 a10 = u8Var.a();
                            y8Var.Z = a10;
                            y8Var.f42350a.b(a10, true);
                            y8Var.s0();
                        }
                        y8Var.Z.f40301f = i7;
                    }
                } else {
                    u8 u8Var2 = y8Var.Z;
                    int i12 = u8Var2.f40300e;
                    if (i12 != i7 && (i12 == 0 || i7 == 0)) {
                        u8 a11 = u8Var2.a();
                        y8Var.Z = a11;
                        y8Var.f42350a.b(a11, true);
                        y8Var.s0();
                    }
                    y8Var.Z.f40300e = i7;
                }
            } else {
                u8 u8Var3 = y8Var.Z;
                int i13 = u8Var3.d;
                if (i13 != i7 && (i13 == 0 || i7 == 0)) {
                    u8 a12 = u8Var3.a();
                    y8Var.Z = a12;
                    y8Var.f42350a.b(a12, true);
                    y8Var.s0();
                }
                y8Var.Z.d = i7;
            }
        } else {
            u8 u8Var4 = y8Var.Z;
            int i14 = u8Var4.f40299c;
            if (i14 != i7 && (i14 == 0 || i7 == 0)) {
                u8 a13 = u8Var4.a();
                y8Var.Z = a13;
                y8Var.f42350a.b(a13, true);
                y8Var.s0();
            }
            y8Var.Z.f40299c = i7;
        }
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25230u4, new Object[0]);
        y8Var.f42350a.invalidate();
    }

    @Override
    public int d(int i7) {
        return 0;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f37140a) {
            case 0:
                this.f37141b.finishFragment();
                return;
            default:
                this.f37141b.finishFragment();
                return;
        }
    }

    @Override
    public void a(boolean z10) {
    }

    @Override
    public void b() {
    }
}
