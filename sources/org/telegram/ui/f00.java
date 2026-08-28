package org.telegram.ui;
public final class f00 implements Runnable {
    public final int f38062a;
    public final g00 f38063b;

    public f00(g00 g00Var, int i9) {
        this.f38062a = i9;
        this.f38063b = g00Var;
    }

    @Override
    public final void run() {
        switch (this.f38062a) {
            case 0:
                this.f38063b.d();
                return;
            case 1:
                this.f38063b.a();
                return;
            default:
                g00 g00Var = this.f38063b;
                g00Var.b(g00Var.f38401y);
                return;
        }
    }
}
