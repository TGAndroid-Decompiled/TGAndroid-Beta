package org.telegram.ui.Components;
public final class t2 implements org.telegram.ui.ActionBar.r1 {
    public final int f38140a;
    public final org.telegram.messenger.c20 f38141b;
    public final boolean[] f38142c;

    public t2(int i7, org.telegram.messenger.c20 c20Var, boolean[] zArr) {
        this.f38140a = i7;
        this.f38141b = c20Var;
        this.f38142c = zArr;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f38140a) {
            case 0:
                this.f38141b.a(Boolean.valueOf(this.f38142c[0]));
                return;
            default:
                this.f38141b.a(Boolean.TRUE);
                this.f38142c[0] = true;
                u1Var.dismiss();
                return;
        }
    }
}
