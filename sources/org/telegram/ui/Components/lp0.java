package org.telegram.ui.Components;
public final class lp0 implements Runnable {
    public final int f37257a;
    public final jt0 f37258b;
    public final int f37259c;

    public lp0(jt0 jt0Var, int i7, int i10) {
        this.f37257a = i10;
        this.f37258b = jt0Var;
        this.f37259c = i7;
    }

    @Override
    public final void run() {
        switch (this.f37257a) {
            case 0:
                this.f37258b.s1(this.f37259c);
                return;
            case 1:
                jt0 jt0Var = this.f37258b;
                org.telegram.ui.ActionBar.g2 g2Var = jt0Var.f36689y1;
                jt0Var.a1(this.f37259c, jt0Var.f36653m1, g2Var);
                return;
            case 2:
                this.f37258b.r1(this.f37259c, false);
                return;
            case 3:
                this.f37258b.s1(this.f37259c);
                return;
            default:
                jt0 jt0Var2 = this.f37258b;
                org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var2.f36689y1;
                jt0Var2.b1(this.f37259c, jt0Var2.f36653m1, g2Var2);
                return;
        }
    }
}
