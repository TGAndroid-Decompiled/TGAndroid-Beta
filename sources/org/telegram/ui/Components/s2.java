package org.telegram.ui.Components;
public final class s2 implements org.telegram.ui.ActionBar.q1 {
    public final int f39162a;
    public final org.telegram.messenger.z10 f39163b;
    public final boolean[] f39164c;

    public s2(int i7, org.telegram.messenger.z10 z10Var, boolean[] zArr) {
        this.f39162a = i7;
        this.f39163b = z10Var;
        this.f39164c = zArr;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f39162a) {
            case 0:
                this.f39163b.a(Boolean.valueOf(this.f39164c[0]));
                return;
            default:
                this.f39163b.a(Boolean.TRUE);
                this.f39164c[0] = true;
                t1Var.dismiss();
                return;
        }
    }
}
