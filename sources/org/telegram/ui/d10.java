package org.telegram.ui;
public final class d10 implements Runnable {
    public final int f35110a;
    public final e10 f35111b;

    public d10(e10 e10Var, int i10) {
        this.f35110a = i10;
        this.f35111b = e10Var;
    }

    @Override
    public final void run() {
        switch (this.f35110a) {
            case 0:
                this.f35111b.d();
                return;
            case 1:
                this.f35111b.a();
                return;
            default:
                e10 e10Var = this.f35111b;
                e10Var.b(e10Var.f35434y);
                return;
        }
    }
}
