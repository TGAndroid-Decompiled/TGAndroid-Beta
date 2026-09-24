package org.telegram.ui;
public final class if0 implements org.telegram.ui.ActionBar.z1 {
    public final int f34496a;
    public final tf0 f34497b;

    public if0(tf0 tf0Var, int i10) {
        this.f34496a = i10;
        this.f34497b = tf0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f34496a) {
            case 0:
                tf0 tf0Var = this.f34497b;
                tf0Var.c(true);
                tf0Var.f38081s0.u1(0, true, null, true);
                return;
            default:
                this.f34497b.f38081s0.u1(0, true, null, true);
                return;
        }
    }
}
