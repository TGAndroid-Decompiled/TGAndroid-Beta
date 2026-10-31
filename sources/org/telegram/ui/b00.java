package org.telegram.ui;
public final class b00 implements Runnable {
    public final int f35917a;
    public final c00 f35918b;

    public b00(c00 c00Var, int i10) {
        this.f35917a = i10;
        this.f35918b = c00Var;
    }

    @Override
    public final void run() {
        switch (this.f35917a) {
            case 0:
                this.f35918b.d();
                return;
            case 1:
                this.f35918b.a();
                return;
            default:
                c00 c00Var = this.f35918b;
                c00Var.b(c00Var.D);
                return;
        }
    }
}
