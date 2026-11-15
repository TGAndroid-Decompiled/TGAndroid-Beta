package org.telegram.ui.Components;
public final class s2 implements org.telegram.ui.ActionBar.q1 {
    public final int f39165a;
    public final org.telegram.messenger.z10 f39166b;
    public final boolean[] f39167c;

    public s2(int i7, org.telegram.messenger.z10 z10Var, boolean[] zArr) {
        this.f39165a = i7;
        this.f39166b = z10Var;
        this.f39167c = zArr;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f39165a) {
            case 0:
                this.f39166b.a(Boolean.valueOf(this.f39167c[0]));
                return;
            default:
                this.f39166b.a(Boolean.TRUE);
                this.f39167c[0] = true;
                t1Var.dismiss();
                return;
        }
    }
}
