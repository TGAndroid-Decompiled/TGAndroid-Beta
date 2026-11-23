package org.telegram.ui.Components;
public final class mp0 implements Runnable {
    public final int f37595a;
    public final jt0 f37596b;
    public final int f37597c;

    public mp0(jt0 jt0Var, int i7, int i10) {
        this.f37595a = i10;
        this.f37596b = jt0Var;
        this.f37597c = i7;
    }

    @Override
    public final void run() {
        switch (this.f37595a) {
            case 0:
                this.f37596b.s1(this.f37597c);
                return;
            case 1:
                jt0 jt0Var = this.f37596b;
                org.telegram.ui.ActionBar.g2 g2Var = jt0Var.f36683y1;
                jt0Var.a1(this.f37597c, jt0Var.f36647m1, g2Var);
                return;
            case 2:
                this.f37596b.r1(this.f37597c, false);
                return;
            case 3:
                this.f37596b.s1(this.f37597c);
                return;
            default:
                jt0 jt0Var2 = this.f37596b;
                org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var2.f36683y1;
                jt0Var2.b1(this.f37597c, jt0Var2.f36647m1, g2Var2);
                return;
        }
    }
}
