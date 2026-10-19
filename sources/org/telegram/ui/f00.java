package org.telegram.ui;
public final class f00 implements Runnable {
    public final int f36846a;
    public final g00 f36847b;

    public f00(g00 g00Var, int i10) {
        this.f36846a = i10;
        this.f36847b = g00Var;
    }

    @Override
    public final void run() {
        switch (this.f36846a) {
            case 0:
                this.f36847b.d();
                return;
            case 1:
                this.f36847b.a();
                return;
            default:
                g00 g00Var = this.f36847b;
                g00Var.b(g00Var.f37162y);
                return;
        }
    }
}
