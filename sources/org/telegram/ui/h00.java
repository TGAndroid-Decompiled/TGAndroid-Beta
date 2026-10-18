package org.telegram.ui;
public final class h00 implements Runnable {
    public final int f37412a;
    public final i00 f37413b;

    public h00(i00 i00Var, int i10) {
        this.f37412a = i10;
        this.f37413b = i00Var;
    }

    @Override
    public final void run() {
        switch (this.f37412a) {
            case 0:
                this.f37413b.d();
                return;
            case 1:
                this.f37413b.a();
                return;
            default:
                i00 i00Var = this.f37413b;
                i00Var.b(i00Var.f37727y);
                return;
        }
    }
}
