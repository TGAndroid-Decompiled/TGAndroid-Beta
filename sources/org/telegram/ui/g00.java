package org.telegram.ui;
public final class g00 implements Runnable {
    public final int f39510a;
    public final h00 f39511b;

    public g00(h00 h00Var, int i10) {
        this.f39510a = i10;
        this.f39511b = h00Var;
    }

    @Override
    public final void run() {
        switch (this.f39510a) {
            case 0:
                this.f39511b.d();
                return;
            case 1:
                this.f39511b.a();
                return;
            default:
                h00 h00Var = this.f39511b;
                h00Var.b(h00Var.f39819y);
                return;
        }
    }
}
