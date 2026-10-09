package org.telegram.ui;
public final class mj0 implements Runnable {
    public final int f39933a;
    public final sj0 f39934b;

    public mj0(sj0 sj0Var, int i10) {
        this.f39933a = i10;
        this.f39934b = sj0Var;
    }

    @Override
    public final void run() {
        switch (this.f39933a) {
            case 0:
                this.f39934b.dismiss();
                return;
            case 1:
                this.f39934b.V(true, false);
                return;
            default:
                this.f39934b.V(true, false);
                return;
        }
    }
}
