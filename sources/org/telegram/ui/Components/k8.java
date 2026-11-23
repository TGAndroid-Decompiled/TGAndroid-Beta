package org.telegram.ui.Components;
public final class k8 implements org.telegram.ui.ActionBar.q1, iq {
    public final int f36673a;
    public final x8 f36674b;

    public k8(x8 x8Var, int i7) {
        this.f36673a = i7;
        this.f36674b = x8Var;
    }

    @Override
    public void c(int i7, int i10, boolean z10) {
        x8 x8Var = this.f36674b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        t8 t8Var = x8Var.Z;
                        int i11 = t8Var.f39858f;
                        if (i11 != i7 && (i11 == 0 || i7 == 0)) {
                            t8 a10 = t8Var.a();
                            x8Var.Z = a10;
                            x8Var.f41918a.b(a10, true);
                            x8Var.s0();
                        }
                        x8Var.Z.f39858f = i7;
                    }
                } else {
                    t8 t8Var2 = x8Var.Z;
                    int i12 = t8Var2.f39857e;
                    if (i12 != i7 && (i12 == 0 || i7 == 0)) {
                        t8 a11 = t8Var2.a();
                        x8Var.Z = a11;
                        x8Var.f41918a.b(a11, true);
                        x8Var.s0();
                    }
                    x8Var.Z.f39857e = i7;
                }
            } else {
                t8 t8Var3 = x8Var.Z;
                int i13 = t8Var3.d;
                if (i13 != i7 && (i13 == 0 || i7 == 0)) {
                    t8 a12 = t8Var3.a();
                    x8Var.Z = a12;
                    x8Var.f41918a.b(a12, true);
                    x8Var.s0();
                }
                x8Var.Z.d = i7;
            }
        } else {
            t8 t8Var4 = x8Var.Z;
            int i14 = t8Var4.f39856c;
            if (i14 != i7 && (i14 == 0 || i7 == 0)) {
                t8 a13 = t8Var4.a();
                x8Var.Z = a13;
                x8Var.f41918a.b(a13, true);
                x8Var.s0();
            }
            x8Var.Z.f39856c = i7;
        }
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25301u4, new Object[0]);
        x8Var.f41918a.invalidate();
    }

    @Override
    public int d(int i7) {
        return 0;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f36673a) {
            case 0:
                this.f36674b.finishFragment();
                return;
            default:
                this.f36674b.finishFragment();
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
