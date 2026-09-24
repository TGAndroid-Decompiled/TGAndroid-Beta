package org.telegram.ui;
public final class fj0 implements Runnable {
    public final int f33676a;
    public final lj0 f33677b;

    public fj0(lj0 lj0Var, int i10) {
        this.f33676a = i10;
        this.f33677b = lj0Var;
    }

    @Override
    public final void run() {
        switch (this.f33676a) {
            case 0:
                this.f33677b.dismiss();
                return;
            case 1:
                this.f33677b.U(true, false);
                return;
            default:
                this.f33677b.U(true, false);
                return;
        }
    }
}
