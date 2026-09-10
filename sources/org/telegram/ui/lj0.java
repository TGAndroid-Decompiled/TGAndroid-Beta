package org.telegram.ui;
public final class lj0 implements Runnable {
    public final int f34728a;
    public final sj0 f34729b;

    public lj0(sj0 sj0Var, int i10) {
        this.f34728a = i10;
        this.f34729b = sj0Var;
    }

    @Override
    public final void run() {
        switch (this.f34728a) {
            case 0:
                this.f34729b.dismiss();
                return;
            case 1:
                this.f34729b.U(true, false);
                return;
            default:
                this.f34729b.U(true, false);
                return;
        }
    }
}
