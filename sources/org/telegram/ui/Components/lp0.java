package org.telegram.ui.Components;
public final class lp0 implements Runnable {
    public final int f37192a;
    public final it0 f37193b;
    public final int f37194c;

    public lp0(it0 it0Var, int i7, int i10) {
        this.f37192a = i10;
        this.f37193b = it0Var;
        this.f37194c = i7;
    }

    @Override
    public final void run() {
        switch (this.f37192a) {
            case 0:
                this.f37193b.s1(this.f37194c);
                return;
            case 1:
                it0 it0Var = this.f37193b;
                org.telegram.ui.ActionBar.g2 g2Var = it0Var.f36166y1;
                it0Var.a1(this.f37194c, it0Var.f36130m1, g2Var);
                return;
            case 2:
                this.f37193b.r1(this.f37194c, false);
                return;
            case 3:
                this.f37193b.s1(this.f37194c);
                return;
            default:
                it0 it0Var2 = this.f37193b;
                org.telegram.ui.ActionBar.g2 g2Var2 = it0Var2.f36166y1;
                it0Var2.b1(this.f37194c, it0Var2.f36130m1, g2Var2);
                return;
        }
    }
}
