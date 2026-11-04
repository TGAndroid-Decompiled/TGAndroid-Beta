package org.telegram.ui.Components;
public final class s2 implements org.telegram.ui.ActionBar.p1 {
    public final int f37886a;
    public final org.telegram.messenger.u10 f37887b;
    public final boolean[] f37888c;

    public s2(int i3, org.telegram.messenger.u10 u10Var, boolean[] zArr) {
        this.f37886a = i3;
        this.f37887b = u10Var;
        this.f37888c = zArr;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f37886a) {
            case 0:
                this.f37887b.a(Boolean.valueOf(this.f37888c[0]));
                return;
            default:
                this.f37887b.a(Boolean.TRUE);
                this.f37888c[0] = true;
                s1Var.dismiss();
                return;
        }
    }
}
