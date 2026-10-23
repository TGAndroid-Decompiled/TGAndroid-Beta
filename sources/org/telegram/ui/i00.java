package org.telegram.ui;
public final class i00 implements Runnable {
    public final int f38001a;
    public final j00 f38002b;

    public i00(j00 j00Var, int i10) {
        this.f38001a = i10;
        this.f38002b = j00Var;
    }

    @Override
    public final void run() {
        switch (this.f38001a) {
            case 0:
                this.f38002b.d();
                return;
            case 1:
                this.f38002b.a();
                return;
            default:
                j00 j00Var = this.f38002b;
                j00Var.b(j00Var.f38429y);
                return;
        }
    }
}
