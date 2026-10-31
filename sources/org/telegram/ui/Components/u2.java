package org.telegram.ui.Components;
public final class u2 implements org.telegram.ui.ActionBar.u1 {
    public final int f30763a;
    public final org.telegram.messenger.q20 f30764b;
    public final boolean[] f30765c;

    public u2(int i10, org.telegram.messenger.q20 q20Var, boolean[] zArr) {
        this.f30763a = i10;
        this.f30764b = q20Var;
        this.f30765c = zArr;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f30763a) {
            case 0:
                this.f30764b.a(Boolean.valueOf(this.f30765c[0]));
                return;
            default:
                this.f30764b.a(Boolean.TRUE);
                this.f30765c[0] = true;
                x1Var.dismiss();
                return;
        }
    }
}
