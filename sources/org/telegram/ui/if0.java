package org.telegram.ui;
public final class if0 implements org.telegram.ui.ActionBar.c2 {
    public final int f34919a;
    public final tf0 f34920b;

    public if0(tf0 tf0Var, int i10) {
        this.f34919a = i10;
        this.f34920b = tf0Var;
    }

    @Override
    public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f34919a) {
            case 0:
                tf0 tf0Var = this.f34920b;
                tf0Var.c(true);
                tf0Var.f38503p0.u1(0, true, null, true);
                return;
            default:
                this.f34920b.f38503p0.u1(0, true, null, true);
                return;
        }
    }
}
