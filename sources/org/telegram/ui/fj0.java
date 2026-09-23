package org.telegram.ui;
public final class fj0 implements Runnable {
    public final int f33339a;
    public final lj0 f33340b;

    public fj0(lj0 lj0Var, int i10) {
        this.f33339a = i10;
        this.f33340b = lj0Var;
    }

    @Override
    public final void run() {
        switch (this.f33339a) {
            case 0:
                this.f33340b.dismiss();
                return;
            case 1:
                this.f33340b.U(true, false);
                return;
            default:
                this.f33340b.U(true, false);
                return;
        }
    }
}
