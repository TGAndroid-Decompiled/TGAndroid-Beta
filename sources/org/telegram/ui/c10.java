package org.telegram.ui;
public final class c10 implements Runnable {
    public final int f34421a;
    public final d10 f34422b;

    public c10(d10 d10Var, int i10) {
        this.f34421a = i10;
        this.f34422b = d10Var;
    }

    @Override
    public final void run() {
        switch (this.f34421a) {
            case 0:
                this.f34422b.d();
                return;
            case 1:
                this.f34422b.a();
                return;
            default:
                d10 d10Var = this.f34422b;
                d10Var.b(d10Var.f34839y);
                return;
        }
    }
}
