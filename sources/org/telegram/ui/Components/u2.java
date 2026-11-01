package org.telegram.ui.Components;
public final class u2 implements org.telegram.ui.ActionBar.u1 {
    public final int f30831a;
    public final org.telegram.messenger.r20 f30832b;
    public final boolean[] f30833c;

    public u2(int i10, org.telegram.messenger.r20 r20Var, boolean[] zArr) {
        this.f30831a = i10;
        this.f30832b = r20Var;
        this.f30833c = zArr;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f30831a) {
            case 0:
                this.f30832b.a(Boolean.valueOf(this.f30833c[0]));
                return;
            default:
                this.f30832b.a(Boolean.TRUE);
                this.f30833c[0] = true;
                x1Var.dismiss();
                return;
        }
    }
}
