package org.telegram.ui;
public final class i00 implements Runnable {
    public final int f38087a;
    public final j00 f38088b;

    public i00(j00 j00Var, int i10) {
        this.f38087a = i10;
        this.f38088b = j00Var;
    }

    @Override
    public final void run() {
        switch (this.f38087a) {
            case 0:
                this.f38088b.d();
                return;
            case 1:
                this.f38088b.a();
                return;
            default:
                j00 j00Var = this.f38088b;
                j00Var.b(j00Var.f38423y);
                return;
        }
    }
}
