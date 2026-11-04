package org.telegram.ui.Components;
public final class f8 implements org.telegram.ui.ActionBar.p1, up {
    public final int f33761a;
    public final r8 f33762b;

    public f8(r8 r8Var, int i3) {
        this.f33761a = i3;
        this.f33762b = r8Var;
    }

    @Override
    public void c(int i3, int i10, boolean z10) {
        r8 r8Var = this.f33762b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        n8 n8Var = r8Var.Z;
                        int i11 = n8Var.f36415f;
                        if (i11 != i3 && (i11 == 0 || i3 == 0)) {
                            n8 a10 = n8Var.a();
                            r8Var.Z = a10;
                            r8Var.f37667a.b(a10, true);
                            r8Var.s0();
                        }
                        r8Var.Z.f36415f = i3;
                    }
                } else {
                    n8 n8Var2 = r8Var.Z;
                    int i12 = n8Var2.f36414e;
                    if (i12 != i3 && (i12 == 0 || i3 == 0)) {
                        n8 a11 = n8Var2.a();
                        r8Var.Z = a11;
                        r8Var.f37667a.b(a11, true);
                        r8Var.s0();
                    }
                    r8Var.Z.f36414e = i3;
                }
            } else {
                n8 n8Var3 = r8Var.Z;
                int i13 = n8Var3.d;
                if (i13 != i3 && (i13 == 0 || i3 == 0)) {
                    n8 a12 = n8Var3.a();
                    r8Var.Z = a12;
                    r8Var.f37667a.b(a12, true);
                    r8Var.s0();
                }
                r8Var.Z.d = i3;
            }
        } else {
            n8 n8Var4 = r8Var.Z;
            int i14 = n8Var4.f36413c;
            if (i14 != i3 && (i14 == 0 || i3 == 0)) {
                n8 a13 = n8Var4.a();
                r8Var.Z = a13;
                r8Var.f37667a.b(a13, true);
                r8Var.s0();
            }
            r8Var.Z.f36413c = i3;
        }
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23297r4, new Object[0]);
        r8Var.f37667a.invalidate();
    }

    @Override
    public int d(int i3) {
        return 0;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f33761a) {
            case 0:
                this.f33762b.finishFragment();
                return;
            default:
                this.f33762b.finishFragment();
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
