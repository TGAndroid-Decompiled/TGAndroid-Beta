package org.telegram.ui;
public final class kj0 implements Runnable {
    public final int f35170a;
    public final rj0 f35171b;

    public kj0(rj0 rj0Var, int i10) {
        this.f35170a = i10;
        this.f35171b = rj0Var;
    }

    @Override
    public final void run() {
        switch (this.f35170a) {
            case 0:
                this.f35171b.dismiss();
                return;
            case 1:
                this.f35171b.U(true, false);
                return;
            default:
                this.f35171b.U(true, false);
                return;
        }
    }
}
