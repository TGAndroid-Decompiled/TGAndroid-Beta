package org.telegram.ui;
public final class h00 implements Runnable {
    public final int f38709a;
    public final i00 f38710b;

    public h00(i00 i00Var, int i10) {
        this.f38709a = i10;
        this.f38710b = i00Var;
    }

    @Override
    public final void run() {
        switch (this.f38709a) {
            case 0:
                this.f38710b.d();
                return;
            case 1:
                this.f38710b.a();
                return;
            default:
                i00 i00Var = this.f38710b;
                i00Var.b(i00Var.f39101y);
                return;
        }
    }
}
