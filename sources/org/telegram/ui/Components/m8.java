package org.telegram.ui.Components;
public final class m8 implements org.telegram.ui.ActionBar.r1, jq {
    public final int f37416a;
    public final y8 f37417b;

    public m8(y8 y8Var, int i7) {
        this.f37416a = i7;
        this.f37417b = y8Var;
    }

    @Override
    public void c(int i7, int i10, boolean z10) {
        y8 y8Var = this.f37417b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        u8 u8Var = y8Var.Z;
                        int i11 = u8Var.f40254f;
                        if (i11 != i7 && (i11 == 0 || i7 == 0)) {
                            u8 a10 = u8Var.a();
                            y8Var.Z = a10;
                            y8Var.f42394a.b(a10, true);
                            y8Var.s0();
                        }
                        y8Var.Z.f40254f = i7;
                    }
                } else {
                    u8 u8Var2 = y8Var.Z;
                    int i12 = u8Var2.f40253e;
                    if (i12 != i7 && (i12 == 0 || i7 == 0)) {
                        u8 a11 = u8Var2.a();
                        y8Var.Z = a11;
                        y8Var.f42394a.b(a11, true);
                        y8Var.s0();
                    }
                    y8Var.Z.f40253e = i7;
                }
            } else {
                u8 u8Var3 = y8Var.Z;
                int i13 = u8Var3.d;
                if (i13 != i7 && (i13 == 0 || i7 == 0)) {
                    u8 a12 = u8Var3.a();
                    y8Var.Z = a12;
                    y8Var.f42394a.b(a12, true);
                    y8Var.s0();
                }
                y8Var.Z.d = i7;
            }
        } else {
            u8 u8Var4 = y8Var.Z;
            int i14 = u8Var4.f40252c;
            if (i14 != i7 && (i14 == 0 || i7 == 0)) {
                u8 a13 = u8Var4.a();
                y8Var.Z = a13;
                y8Var.f42394a.b(a13, true);
                y8Var.s0();
            }
            y8Var.Z.f40252c = i7;
        }
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25202u4, new Object[0]);
        y8Var.f42394a.invalidate();
    }

    @Override
    public int d(int i7) {
        return 0;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f37416a) {
            case 0:
                this.f37417b.finishFragment();
                return;
            default:
                this.f37417b.finishFragment();
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
