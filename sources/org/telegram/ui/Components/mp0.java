package org.telegram.ui.Components;
public final class mp0 implements Runnable {
    public final int f37596a;
    public final jt0 f37597b;
    public final int f37598c;

    public mp0(jt0 jt0Var, int i7, int i10) {
        this.f37596a = i10;
        this.f37597b = jt0Var;
        this.f37598c = i7;
    }

    @Override
    public final void run() {
        switch (this.f37596a) {
            case 0:
                this.f37597b.s1(this.f37598c);
                return;
            case 1:
                jt0 jt0Var = this.f37597b;
                org.telegram.ui.ActionBar.g2 g2Var = jt0Var.f36684y1;
                jt0Var.a1(this.f37598c, jt0Var.f36648m1, g2Var);
                return;
            case 2:
                this.f37597b.r1(this.f37598c, false);
                return;
            case 3:
                this.f37597b.s1(this.f37598c);
                return;
            default:
                jt0 jt0Var2 = this.f37597b;
                org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var2.f36684y1;
                jt0Var2.b1(this.f37598c, jt0Var2.f36648m1, g2Var2);
                return;
        }
    }
}
