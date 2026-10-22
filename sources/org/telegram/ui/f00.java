package org.telegram.ui;
public final class f00 implements Runnable {
    public final int f36850a;
    public final g00 f36851b;

    public f00(g00 g00Var, int i10) {
        this.f36850a = i10;
        this.f36851b = g00Var;
    }

    @Override
    public final void run() {
        switch (this.f36850a) {
            case 0:
                this.f36851b.d();
                return;
            case 1:
                this.f36851b.a();
                return;
            default:
                g00 g00Var = this.f36851b;
                g00Var.b(g00Var.f37166y);
                return;
        }
    }
}
