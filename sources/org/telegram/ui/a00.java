package org.telegram.ui;
public final class a00 implements Runnable {
    public final int f35502a;
    public final b00 f35503b;

    public a00(b00 b00Var, int i10) {
        this.f35502a = i10;
        this.f35503b = b00Var;
    }

    @Override
    public final void run() {
        switch (this.f35502a) {
            case 0:
                this.f35503b.d();
                return;
            case 1:
                this.f35503b.a();
                return;
            default:
                b00 b00Var = this.f35503b;
                b00Var.b(b00Var.D);
                return;
        }
    }
}
