package org.telegram.ui;
public final class h00 implements Runnable {
    public final int f37374a;
    public final i00 f37375b;

    public h00(i00 i00Var, int i10) {
        this.f37374a = i10;
        this.f37375b = i00Var;
    }

    @Override
    public final void run() {
        switch (this.f37374a) {
            case 0:
                this.f37375b.d();
                return;
            case 1:
                this.f37375b.a();
                return;
            default:
                i00 i00Var = this.f37375b;
                i00Var.b(i00Var.f37689y);
                return;
        }
    }
}
