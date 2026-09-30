package org.telegram.ui;
public final class fj0 implements Runnable {
    public final int f33692a;
    public final lj0 f33693b;

    public fj0(lj0 lj0Var, int i10) {
        this.f33692a = i10;
        this.f33693b = lj0Var;
    }

    @Override
    public final void run() {
        switch (this.f33692a) {
            case 0:
                this.f33693b.dismiss();
                return;
            case 1:
                this.f33693b.U(true, false);
                return;
            default:
                this.f33693b.U(true, false);
                return;
        }
    }
}
