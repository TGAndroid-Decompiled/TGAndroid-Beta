package org.telegram.ui.Components;
public final class mp0 implements Runnable {
    public final int f37551a;
    public final jt0 f37552b;
    public final int f37553c;

    public mp0(jt0 jt0Var, int i7, int i10) {
        this.f37551a = i10;
        this.f37552b = jt0Var;
        this.f37553c = i7;
    }

    @Override
    public final void run() {
        switch (this.f37551a) {
            case 0:
                this.f37552b.s1(this.f37553c);
                return;
            case 1:
                jt0 jt0Var = this.f37552b;
                org.telegram.ui.ActionBar.g2 g2Var = jt0Var.f36638y1;
                jt0Var.a1(this.f37553c, jt0Var.f36602m1, g2Var);
                return;
            case 2:
                this.f37552b.r1(this.f37553c, false);
                return;
            case 3:
                this.f37552b.s1(this.f37553c);
                return;
            default:
                jt0 jt0Var2 = this.f37552b;
                org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var2.f36638y1;
                jt0Var2.b1(this.f37553c, jt0Var2.f36602m1, g2Var2);
                return;
        }
    }
}
