package org.telegram.ui;
public final class f00 implements Runnable {
    public final int f36847a;
    public final g00 f36848b;

    public f00(g00 g00Var, int i10) {
        this.f36847a = i10;
        this.f36848b = g00Var;
    }

    @Override
    public final void run() {
        switch (this.f36847a) {
            case 0:
                this.f36848b.d();
                return;
            case 1:
                this.f36848b.a();
                return;
            default:
                g00 g00Var = this.f36848b;
                g00Var.b(g00Var.f37163y);
                return;
        }
    }
}
