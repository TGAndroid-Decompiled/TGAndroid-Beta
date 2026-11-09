package org.telegram.ui.Components;
public final class u2 implements org.telegram.ui.ActionBar.r1 {
    public final int f38568a;
    public final org.telegram.messenger.c20 f38569b;
    public final boolean[] f38570c;

    public u2(int i7, org.telegram.messenger.c20 c20Var, boolean[] zArr) {
        this.f38568a = i7;
        this.f38569b = c20Var;
        this.f38570c = zArr;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f38568a) {
            case 0:
                this.f38569b.a(Boolean.valueOf(this.f38570c[0]));
                return;
            default:
                this.f38569b.a(Boolean.TRUE);
                this.f38570c[0] = true;
                u1Var.dismiss();
                return;
        }
    }
}
