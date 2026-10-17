package org.telegram.ui;
public final class h00 implements Runnable {
    public final int f37394a;
    public final i00 f37395b;

    public h00(i00 i00Var, int i10) {
        this.f37394a = i10;
        this.f37395b = i00Var;
    }

    @Override
    public final void run() {
        switch (this.f37394a) {
            case 0:
                this.f37395b.d();
                return;
            case 1:
                this.f37395b.a();
                return;
            default:
                i00 i00Var = this.f37395b;
                i00Var.b(i00Var.f37713y);
                return;
        }
    }
}
