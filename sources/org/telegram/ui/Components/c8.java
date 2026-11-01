package org.telegram.ui.Components;
public final class c8 implements org.telegram.ui.ActionBar.u1, bq {
    public final int f25059a;
    public final o8 f25060b;

    public c8(o8 o8Var, int i10) {
        this.f25059a = i10;
        this.f25060b = o8Var;
    }

    @Override
    public void c(int i10, int i11, boolean z10) {
        o8 o8Var = this.f25060b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        k8 k8Var = o8Var.Y;
                        int i12 = k8Var.f27771f;
                        if (i12 != i10 && (i12 == 0 || i10 == 0)) {
                            k8 a2 = k8Var.a();
                            o8Var.Y = a2;
                            o8Var.f29044a.b(a2, true);
                            o8Var.s0();
                        }
                        o8Var.Y.f27771f = i10;
                    }
                } else {
                    k8 k8Var2 = o8Var.Y;
                    int i13 = k8Var2.e;
                    if (i13 != i10 && (i13 == 0 || i10 == 0)) {
                        k8 a10 = k8Var2.a();
                        o8Var.Y = a10;
                        o8Var.f29044a.b(a10, true);
                        o8Var.s0();
                    }
                    o8Var.Y.e = i10;
                }
            } else {
                k8 k8Var3 = o8Var.Y;
                int i14 = k8Var3.d;
                if (i14 != i10 && (i14 == 0 || i10 == 0)) {
                    k8 a11 = k8Var3.a();
                    o8Var.Y = a11;
                    o8Var.f29044a.b(a11, true);
                    o8Var.s0();
                }
                o8Var.Y.d = i10;
            }
        } else {
            k8 k8Var4 = o8Var.Y;
            int i15 = k8Var4.f27770c;
            if (i15 != i10 && (i15 == 0 || i10 == 0)) {
                k8 a12 = k8Var4.a();
                o8Var.Y = a12;
                o8Var.f29044a.b(a12, true);
                o8Var.s0();
            }
            o8Var.Y.f27770c = i10;
        }
        org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14777r4, new Object[0]);
        o8Var.f29044a.invalidate();
    }

    @Override
    public int d(int i10) {
        return 0;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f25059a) {
            case 0:
                this.f25060b.finishFragment();
                return;
            default:
                this.f25060b.finishFragment();
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
