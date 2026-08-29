package org.telegram.ui.Components;
public final class f7 implements Runnable {
    public final int f28338a;
    public final g8 f28339b;
    public final j70 f28340c;

    public f7(g8 g8Var, j70 j70Var, int i10) {
        this.f28338a = i10;
        this.f28339b = g8Var;
        this.f28340c = j70Var;
    }

    @Override
    public final void run() {
        switch (this.f28338a) {
            case 0:
                g8 g8Var = this.f28339b;
                g8Var.getClass();
                this.f28340c.u();
                g8Var.t0(1);
                return;
            case 1:
                g8 g8Var2 = this.f28339b;
                g8Var2.getClass();
                this.f28340c.u();
                g8Var2.t0(2);
                return;
            case 2:
                g8 g8Var3 = this.f28339b;
                g8Var3.getClass();
                this.f28340c.u();
                g8Var3.t0(4);
                return;
            case 3:
                g8 g8Var4 = this.f28339b;
                g8Var4.getClass();
                this.f28340c.u();
                g8Var4.t0(7);
                return;
            default:
                g8.q(this.f28339b, this.f28340c);
                return;
        }
    }
}
