package org.telegram.ui.Components;
public final class e8 implements org.telegram.ui.ActionBar.q1, cq {
    public final int f34251a;
    public final q8 f34252b;

    public e8(q8 q8Var, int i7) {
        this.f34251a = i7;
        this.f34252b = q8Var;
    }

    @Override
    public void c(int i7, int i10, boolean z10) {
        q8 q8Var = this.f34252b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        m8 m8Var = q8Var.Z;
                        int i11 = m8Var.f37165f;
                        if (i11 != i7 && (i11 == 0 || i7 == 0)) {
                            m8 a10 = m8Var.a();
                            q8Var.Z = a10;
                            q8Var.f38562a.b(a10, true);
                            q8Var.s0();
                        }
                        q8Var.Z.f37165f = i7;
                    }
                } else {
                    m8 m8Var2 = q8Var.Z;
                    int i12 = m8Var2.f37164e;
                    if (i12 != i7 && (i12 == 0 || i7 == 0)) {
                        m8 a11 = m8Var2.a();
                        q8Var.Z = a11;
                        q8Var.f38562a.b(a11, true);
                        q8Var.s0();
                    }
                    q8Var.Z.f37164e = i7;
                }
            } else {
                m8 m8Var3 = q8Var.Z;
                int i13 = m8Var3.d;
                if (i13 != i7 && (i13 == 0 || i7 == 0)) {
                    m8 a12 = m8Var3.a();
                    q8Var.Z = a12;
                    q8Var.f38562a.b(a12, true);
                    q8Var.s0();
                }
                q8Var.Z.d = i7;
            }
        } else {
            m8 m8Var4 = q8Var.Z;
            int i14 = m8Var4.f37163c;
            if (i14 != i7 && (i14 == 0 || i7 == 0)) {
                m8 a13 = m8Var4.a();
                q8Var.Z = a13;
                q8Var.f38562a.b(a13, true);
                q8Var.s0();
            }
            q8Var.Z.f37163c = i7;
        }
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25564r4, new Object[0]);
        q8Var.f38562a.invalidate();
    }

    @Override
    public int d(int i7) {
        return 0;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f34251a) {
            case 0:
                this.f34252b.finishFragment();
                return;
            default:
                this.f34252b.finishFragment();
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
