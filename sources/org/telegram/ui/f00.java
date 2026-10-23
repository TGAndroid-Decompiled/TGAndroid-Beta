package org.telegram.ui;
public final class f00 implements Runnable {
    public final int f36851a;
    public final g00 f36852b;

    public f00(g00 g00Var, int i10) {
        this.f36851a = i10;
        this.f36852b = g00Var;
    }

    @Override
    public final void run() {
        switch (this.f36851a) {
            case 0:
                this.f36852b.d();
                return;
            case 1:
                this.f36852b.a();
                return;
            default:
                g00 g00Var = this.f36852b;
                g00Var.b(g00Var.f37167y);
                return;
        }
    }
}
