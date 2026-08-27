package org.telegram.ui;

public final class i00 implements Runnable {

    public final int f38930a;

    public final j00 f38931b;

    public i00(j00 j00Var, int i10) {
        this.f38930a = i10;
        this.f38931b = j00Var;
    }

    @Override
    public final void run() {
        switch (this.f38930a) {
            case 0:
                this.f38931b.d();
                break;
            case 1:
                this.f38931b.a();
                break;
            default:
                j00 j00Var = this.f38931b;
                j00Var.b(j00Var.f39208y);
                break;
        }
    }
}
