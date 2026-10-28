package org.telegram.ui;
public final class i00 implements Runnable {
    public final int f40014a;
    public final j00 f40015b;

    public i00(j00 j00Var, int i10) {
        this.f40014a = i10;
        this.f40015b = j00Var;
    }

    @Override
    public final void run() {
        switch (this.f40014a) {
            case 0:
                this.f40015b.d();
                return;
            case 1:
                this.f40015b.a();
                return;
            default:
                j00 j00Var = this.f40015b;
                j00Var.b(j00Var.f40309y);
                return;
        }
    }
}
