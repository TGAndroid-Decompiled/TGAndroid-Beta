package org.telegram.ui.Components;
public final class u2 implements org.telegram.ui.ActionBar.r1 {
    public final int f38494a;
    public final org.telegram.messenger.c20 f38495b;
    public final boolean[] f38496c;

    public u2(int i7, org.telegram.messenger.c20 c20Var, boolean[] zArr) {
        this.f38494a = i7;
        this.f38495b = c20Var;
        this.f38496c = zArr;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f38494a) {
            case 0:
                this.f38495b.a(Boolean.valueOf(this.f38496c[0]));
                return;
            default:
                this.f38495b.a(Boolean.TRUE);
                this.f38496c[0] = true;
                u1Var.dismiss();
                return;
        }
    }
}
