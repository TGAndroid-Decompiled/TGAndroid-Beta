package org.telegram.ui;
public final class f00 implements Runnable {
    public final int f36840a;
    public final g00 f36841b;

    public f00(g00 g00Var, int i10) {
        this.f36840a = i10;
        this.f36841b = g00Var;
    }

    @Override
    public final void run() {
        switch (this.f36840a) {
            case 0:
                this.f36841b.d();
                return;
            case 1:
                this.f36841b.a();
                return;
            default:
                g00 g00Var = this.f36841b;
                g00Var.b(g00Var.f37156y);
                return;
        }
    }
}
