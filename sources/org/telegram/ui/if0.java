package org.telegram.ui;
public final class if0 implements org.telegram.ui.ActionBar.z1 {
    public final int f34604a;
    public final tf0 f34605b;

    public if0(tf0 tf0Var, int i10) {
        this.f34604a = i10;
        this.f34605b = tf0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f34604a) {
            case 0:
                tf0 tf0Var = this.f34605b;
                tf0Var.c(true);
                tf0Var.f38208s0.u1(0, true, null, true);
                return;
            default:
                this.f34605b.f38208s0.u1(0, true, null, true);
                return;
        }
    }
}
